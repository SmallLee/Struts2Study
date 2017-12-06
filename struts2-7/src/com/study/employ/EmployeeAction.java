package com.study.employ;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
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

    public String update(){
        dao.update(employee);
        return "update";
    }
    public String edit(){
//        System.out.println("edit"+employee.getId());
//        Employee emp = dao.getEmployee(this.employee.getId());
//        //把栈顶对象的属性装配好，此时栈顶对象是employee,
//        //目前这个对象只有id属性有值，其他都是null
//        System.out.println(emp);
//        employee.setFirstName(emp.getFirstName());
//        employee.setLastName(emp.getLastName());
//        employee.setEmail(emp.getEmail());
        //不能进行回显，因为employee已经不是栈顶那个对象
//        employee = dao.getEmployee(employee.getId());
        //手动的把数据库获取的对象放入到值栈栈顶，但是这样值栈中会多出一个对象
//        ActionContext.getContext().getValueStack().push(dao.getEmployee(employee.getId()));
        return "edit";
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }


    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Employee getModel() {
        //判断是create还是Edit，判定标准为是否有id，有，是Edit,
        //若通过id来判断，则首先要保证能获取到id，而默认的parametersInterceptro实在modelDriven之后的，
        //所以我们不能使用默认的拦截器，而这可以通过paramsPrepareParamsStack实现，需要在struts.xml文件中配置
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        if (id == null) {
            employee = new Employee();
        } else {
            employee = dao.getEmployee(id);
        }
        return employee;
    }
}
