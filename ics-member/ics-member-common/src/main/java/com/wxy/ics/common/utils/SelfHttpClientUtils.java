package com.wxy.ics.common.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.wxy.ics.common.enums.CodeEnum.*;

/**
 * Http请求工具类
 * @author wxy
 * @date 2019/03/22
 */
@Slf4j
public class SelfHttpClientUtils {
    private static final String CHARSET = "UTF-8";
    private static final String CONTENTTYPE ="application/x-www-form-urlencoded;charset=UTF-8";
    private static final int SUCCESSCODE= 200;
    private SelfHttpClientUtils(){}

    /**
     * 发送httpPost请求，application/x-www-form-urlencoded 形式
     *
     * @param url 请求url
     * @param map 请求参数 Map类型
     * @return
     */
    public static JSONObject httpPostWithMap(String url, Map<String, String> map)  {
        url = url.trim();
        JSONObject returnResult;
        try {
            if(StringUtils.isEmpty(url) || null == map || map.isEmpty()){
                returnResult = new JSONObject();
                returnResult.put("msg", BIND_ERROR.getMessage());
                returnResult.put("code",BIND_ERROR.getKey());
                return returnResult;
            }
            //创建POST请求
            HttpPost post = new HttpPost(url);
            post.setHeader("Content-type", (new StringBuilder()).append(CONTENTTYPE).toString());
            post.setHeader("Accept",new StringBuffer("text/xml;charset=").append(CHARSET).toString());
            post.setHeader("Cache-Control", "no-cache");

            List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
            //请求参数
            for(String key : map.keySet()){
                params.add(new BasicNameValuePair(key,map.get(key)));
            }
            post.setEntity(new UrlEncodedFormEntity(params, CHARSET));

            //发送请求
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpResponse response = client.execute(post);
            String res = EntityUtils.toString(response.getEntity(), CHARSET);
            if(response.getStatusLine().getStatusCode() != HttpStatus.SC_OK){
                returnResult= new JSONObject();
                log.error("请求失败:"+res);
                returnResult.put("msg",res);
                returnResult.put("code",HTTP_REQUEST_FAIL.getKey());
                return returnResult;
            }
            log.info("请求成功:"+res);
            return  StringUtils.isEmpty(res) ? null : JSONObject.parseObject(res);
        }  catch (Exception e) {
            log.error("客户端请求异常",e);
            returnResult= new JSONObject();
            returnResult.put("msg",e);
            returnResult.put("code",SERVER_ERROR.getKey());
            return returnResult;
        }
    }

    /**
     * post方式
     * @param url 请求url地址
     * @param headers 请求头
     * @param param post请求参数 String类型
     * @param contentType 请求Content类型
     * @return 服务器response的内容
     */
    public static String httpPost(String url,Map<String, String> headers, String param,String contentType){
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        String respContent = null;
        //json方式

        StringEntity entity = new StringEntity(param,CHARSET);
        entity.setContentType(contentType);

        httpPost.setEntity(entity);
        if (headers!=null){

            for (Map.Entry<String, String> e : headers.entrySet()) {
                httpPost.setHeader(e.getKey(), e.getValue());
            }
        }
        HttpResponse resp = null;
        try {
            resp = client.execute(httpPost);
            if(resp.getStatusLine().getStatusCode() == SUCCESSCODE) {
                HttpEntity he = resp.getEntity();
                respContent = EntityUtils.toString(he,CHARSET);
            }
        } catch (Exception e) {
            log.error("请求异常:{}",url,e);
            return respContent;
        }finally {
            try {
                client.close();
            } catch (IOException e) {
                log.error("请求异常:{}",url,e);
            }
        }
        return respContent;
    }
    /**
     * Get请求
     * @param url
     * @return 服务器端返回的内容
     */
    public static String httpGet(String url){
        url = url.trim();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String ret = null;
        // 创建参数队列
        try {
            //参数转换为字符串
            // 创建httpget.
            HttpGet httpget = new HttpGet(url);
           log.info("executing request{}", httpget.getURI());
            // 执行get请求.
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                // 打印响应状态
                log.info("response.getStatusLine{}",response.getStatusLine());
                if (entity != null) {
                    ret = EntityUtils.toString(entity);
                    log.info("Response content: {}",ret);
                    return ret;
                }
            } finally {
                response.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Http客户端GET请求url为{}异常",url,e);
            return ret;
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                log.error("关闭连接异常{}",url,e);
            }
        }
        return ret;

    }

    /**
     * 传输 MultipartFile
     * @param url
     * @param multipartFile
     * @param fileParName
     * @param params
     * @return
     */
    public static String httpPostMultipartFile(String url, MultipartFile multipartFile, String fileParName, Map<String, Object> params) {
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        String respContent = null;
        HttpResponse resp = null;
        try {
            // 文件流
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setCharset(java.nio.charset.Charset.forName("UTF-8"));
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            String fileName = multipartFile.getOriginalFilename();
            builder.addBinaryBody(fileParName, multipartFile.getInputStream(), ContentType.MULTIPART_FORM_DATA, fileName);
            //决中文乱码
            ContentType contentType = ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8);
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if(entry.getValue() == null) {
                    continue;
                }
                // 类似浏览器表单提交，对应input的name和value
                builder.addTextBody(entry.getKey(), entry.getValue().toString(), contentType);
            }
            HttpEntity entity = builder.build();
            httpPost.setEntity(entity);
            resp = client.execute(httpPost);
            if(resp.getStatusLine().getStatusCode() == SUCCESSCODE) {
                HttpEntity he = resp.getEntity();
                respContent = EntityUtils.toString(he,"UTF-8");
            }
        } catch (Exception e) {
            log.error("请求异常:{}",url,e);
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                log.error("请求异常:{}",url,e);
            }
        }
        return respContent;
    }
}
