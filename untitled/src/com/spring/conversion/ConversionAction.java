package com.spring.conversion;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ValidationAware;

import java.util.Collection;
import java.util.Date;

public class ConversionAction extends ActionSupport{
    private int age;
    private Date date;

    public void setAge(int age) {
        System.out.println("setage" + age);
        this.age = age;
    }

    public ConversionAction(){
        System.out.println("constructor");
    }

    public int getAge() {
        System.out.println("getage");
        return age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String execute(){
        System.out.println("========execute");
        System.out.println("date======"+date);
        return "success";
    }
}
