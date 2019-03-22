package com.wxy.ics.member.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wxy
 * @date 2019/03/21
 */
@Configuration
@ConfigurationProperties(prefix = "login")
public class LoginProperties {
    private String appid;
    private String secret;
    private String accesstokenUrl;
    private String userInfoUrl;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getAccesstokenUrl() {
        return accesstokenUrl;
    }

    public void setAccesstokenUrl(String accesstokenUrl) {
        this.accesstokenUrl = accesstokenUrl;
    }

    public String getUserInfoUrl() {
        return userInfoUrl;
    }

    public void setUserInfoUrl(String userInfoUrl) {
        this.userInfoUrl = userInfoUrl;
    }

    @Override
    public String toString() {
        return "LoginProperties{" +
                "appid='" + appid + '\'' +
                ", secret='" + secret + '\'' +
                ", accesstokenUrl='" + accesstokenUrl + '\'' +
                ", userInfoUrl='" + userInfoUrl + '\'' +
                '}';
    }
}
