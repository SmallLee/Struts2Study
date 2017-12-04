package com.struts.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Product implements RequestAware,SessionAware{
    private String productName;
    private String productDesc;
    private String productPrice;

    public Product(){
        System.out.println("无参数的构造函数");
    }
//    public Product(String productName, String productDesc, String productPrice) {
//        this.productName = productName;
//        this.productDesc = productDesc;
//        this.productPrice = productPrice;
//    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String save(){
        System.out.println("detail " + this);
        //获取值栈
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        //创建Test对象，并为属性赋值
        Test test = new Test();
        test.setProductDesc("我是描述");
        test.setProductPrice("222");
        //把test对象放入栈顶
        valueStack.push(test);
        sessionMap.put("product",this);
        requestMap.put("test", test);
        int a = 1/0;
        return "success";
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }

    private Map<String,Object> requestMap;
    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }

    private Map<String,Object> sessionMap;
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }
}
