package com.wxy.ics.member.controller;

import com.alibaba.fastjson.JSONObject;
import com.wxy.ics.common.entity.vo.ReturnResultVO;
import com.wxy.ics.common.entity.vo.UserInfoVO;
import com.wxy.ics.common.utils.SelfHttpClientUtils;
import com.wxy.ics.member.config.LoginProperties;
import com.wxy.ics.member.domain.MemberPO;
import com.wxy.ics.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.wxy.ics.common.enums.CodeMsg.*;

/**
 * @author wxy
 * @date 2019/03/21
 */
@RestController
@RequestMapping("/api/member")
@Slf4j
public class LoginController {
    @Autowired
    LoginProperties loginProperties;
    @Autowired
    MemberService memberService;

    @PostMapping("/wechat/login")
    public ReturnResultVO<MemberPO> wechatLogin(@RequestParam("code") String code){
        log.info("接收到的code为{}",code);
        ReturnResultVO<MemberPO> result = null;
        try {
            Map<String,Object> accessToken = this.getAccessToken(code);
            log.info("获取到的accessToken为{}",accessToken);
            //请求失败,空就说明刚刚的请求没有发送成功
            if (accessToken==null) {
                result = new ReturnResultVO<>();
                result.setCode(ACCESSTOKEN_GET_FAIL.getKey());
                result.setMsg(ACCESSTOKEN_GET_FAIL.getMessage());
                result.setSuccess(false);
                return result;
            }

            //请求成功，获取openId,access_token
            String accessTokenStr = String.valueOf(accessToken.get("access_token"));
            String openIdStr = String.valueOf(accessToken.get("openid"));
            /**
             *通过openId查找数据库，如果查得到用户说明这个微信号
             *登陆过，直接返回这个用户的信息即可，否则就继续调用
             *另一个http请求获得用户的信息，然后将这个信息插入的自己的数据库
             */
            MemberPO meberPO = memberService.getMemberByOpenId(openIdStr);
            //没有微信登陆过，发送请求获取微信信息，再添加入库
            if (meberPO == null) {
                UserInfoVO wechatUserInfo = this.getWechatUserInfo(openIdStr, accessTokenStr);
                if (wechatUserInfo == null){

                }
                //将上方的该用户插入到你的数据库且返回到前端
                return result;
            }else {//user!=null用微信登陆过，直接将user放入返回即可
                //返回user信息给前端app
                return result;
            }
        }catch (Exception e){
            result = new ReturnResultVO<>();
            result.setCode(WECHAT_LOGIN_ERROR.getKey());
            result.setMsg(WECHAT_LOGIN_ERROR.getMessage());
            result.setSuccess(false);
            log.error("微信登陆异常",e);
            return result;
        }
    }


    private  Map<String,Object> getAccessToken(String code){
        String url = new StringBuilder(loginProperties.getAccesstokenUrl())
                .append("?grant_type=authorization_code&appid=")
                .append(loginProperties.getAppid()).append("&secret=")
                .append(loginProperties.getSecret()).append("&code=")
                .append(code).toString();
        try {
            String responseStr = SelfHttpClientUtils.httpGet(url);
            log.info("获取微信开放平台token返回信息为{}",responseStr);
            if (responseStr==null){
                log.warn("response为null");
                return null;
            }
            JSONObject parseObject = JSONObject.parseObject(responseStr, JSONObject.class);
            String accessToken = (String)parseObject.get("access_token");
            //有token说明请求正确，返回Map信息
            if (accessToken != null){
                return parseObject;
            }
        } catch (Exception e) {
            log.error("获取accessToken失败",e);
        }
        return null;
    }

    private  UserInfoVO getWechatUserInfo(String openId, String accessToken){
        log.info("接收到的openId为{},accessToken为{}",openId,accessToken);
        String url = new StringBuilder(loginProperties.getUserInfoUrl())
                .append("?openid=")
                .append(openId)
                .append("&access_token=")
                .append(accessToken)
                .toString();
        try {
            String responseStr = SelfHttpClientUtils.httpGet(url);
            if (responseStr==null){
                log.warn("response为null");
                return null;
            }
            JSONObject parseObject = JSONObject.parseObject(responseStr, JSONObject.class);
            String id = (String)parseObject.get("openid");
            //成功获取用户信息
            if (id != null){
                String nickname = (String)parseObject.get("nickname");
                String headimgurl = (String)parseObject.get("headimgurl");
                UserInfoVO user = new UserInfoVO();
                user.setNikeName(nickname)
                    .setOpenId(openId)
                    .setUserImg(headimgurl);
                //这里只选了三个字段，根据自己的业务选择更多的字段
                return user;
            }
        }catch (Exception e){
            log.error("获取用户openId为{}信息异常",openId,e);
        }
        return null;
    }
}
