package com.study.employ;

import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.interceptor.HttpParametersAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;

import javax.print.DocFlavor;
import java.util.Map;

public class EmployeeAction implements RequestAware,ModelDriven<Employee>{

    private Map<String,Object> requestMap;
    private Dao dao = new Dao();
    //需要在当前Action类中定义id，以接收请求参数的值，因为Struts2会把请求对象放到值栈顶部
//    private Integer  id;
    private Employee employee;

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String list() {
        requestMap.put("emps",dao.getAllEmployees());
        return "list";
    }

    public String delete(){
        dao.delete(employee.getId());
        return "delete";
    }

    public String add(){
        System.out.println("=======add");
        dao.add(employee);
        return "add";
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }

    @Override
    public Employee getModel() {
        employee = new Employee();
        return employee;
    }
}
