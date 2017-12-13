package com.struts.validation;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidation extends ActionSupport{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
//
    public String execute() {
        System.out.println("==========age "+age);
        return SUCCESS;
    }
}
