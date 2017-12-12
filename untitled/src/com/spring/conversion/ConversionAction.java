package com.spring.conversion;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.spring.conversion.model.Customer;

import java.util.Date;

public class ConversionAction extends ActionSupport implements ModelDriven<Customer>{
    private Customer model;

    public String execute(){
        System.out.println("model===" + model);
        return "success";
    }

    @Override
    public Customer getModel() {
        model = new Customer();
        return model;
    }
}
