package com.struts.study;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class UserAction {
    private String userId;
    private String userName;
    private String userDesc;
    private String userPassword;
    private boolean married = true;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserAction(String userId, String userName, String userDesc, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userDesc = userDesc;
        this.userPassword = userPassword;
    }
    public UserAction(){}

    @Override
    public String toString() {
        return "UserAction{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userDesc='" + userDesc + '\'' +
                ", userPassword='" + userPassword + '\'' + married +
                '}';
    }

    public String save(){
        System.out.println(this);
        return "input";
    }
}
