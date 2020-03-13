package com.vip;

import java.util.Observable;

/**
 * @ClassName GPer
 * @Description JDK提供的一种观察这实现方式
 * @Author zxx
 * @Date 2020/3/12 11:47
 * @Version 1.0
 **/
public class GPer extends Observable {

    private String name = "GPer 生态圈";
    private static GPer gper = null;
    private GPer(){ }

    public static GPer getInstance(){
        if (null == gper){
            gper = new GPer();
        }

        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+name+"提交了一个问题"+question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
