package com.bingoo.im.common.BO;

import java.io.Serializable;

/**
 * @author jianbin
 * @date 2019/11/27
 */
public class UserInfo implements Serializable {
    private Integer userId;
    private String username;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public UserInfo setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserInfo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserInfo setPassword(String password) {
        this.password = password;
        return this;
    }
}
