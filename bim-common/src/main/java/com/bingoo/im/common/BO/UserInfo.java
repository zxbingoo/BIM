package com.bingoo.im.common.BO;

/**
 * @author jianbin
 * @date 2019/11/27
 */
public class UserInfo {
    private Integer userId;
    private String userName;
    private String passward;

    public Integer getUserId() {
        return userId;
    }

    public UserInfo setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassward() {
        return passward;
    }

    public UserInfo setPassward(String passward) {
        this.passward = passward;
        return this;
    }
}
