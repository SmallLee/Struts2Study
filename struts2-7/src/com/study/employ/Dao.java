package com.study.employ;

import java.util.*;

public class Dao {
    public static Map<Integer,Employee> emps = new HashMap<Integer,Employee>();

    static {
        emps.put(1001,new Employee(1001,"AA","aa","a.com"));
        emps.put(1003,new Employee(1002,"BB","bb","b.com"));
        emps.put(1004,new Employee(1004,"CC","cc","c.com"));
        emps.put(1006,new Employee(1005,"CC","cc","c.com"));
        emps.put(1005,new Employee(1006,"CC","cc","c.com"));
    }
    public List<Employee> getAllEmployees(){
        return new ArrayList<Employee>(emps.values());
    }

    public void delete(Integer id){
        emps.remove(id);
    }
    public void add(Employee employee) {
        long time = System.currentTimeMillis();
        employee.setId((int) time);
        emps.put(employee.getId(),employee);
    }
    public void update(Employee employee) {
        emps.put(employee.getId(),employee);
    }

    public Employee getEmployee(Integer id){
        return emps.get(id);
    }
}
