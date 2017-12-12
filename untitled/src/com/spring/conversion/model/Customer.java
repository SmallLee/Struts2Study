package com.spring.conversion.model;

import java.util.Date;

public class Customer {
    private int age;
    private Date date;

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setDate(Date date) {
        System.out.println(date);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", date=" + date +
                '}';
    }
}
