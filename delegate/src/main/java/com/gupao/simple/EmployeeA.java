package com.gupao.simple;

public class EmployeeA implements Employee {
    public void doing(String command) {
        System.out.println("我是员工A, 我开始干活，擅长加密："+command);
    }
}
