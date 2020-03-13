package com.vip;

import javafx.beans.InvalidationListener;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author zxx
 * @Date 2020/3/12 11:53
 * @Version 1.0
 **/
public class Teacher implements Observer {

    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        GPer gPer =(GPer)o;
        Question question= (Question)arg;
        System.out.println("=======================");
        System.out.println(name +"老师，你好！您收到一个来自"+gPer.getName()+"的提问，希望能够解答，问题如下："+question.getContent()+"  提问者："+question.getUserName());
    }
}
