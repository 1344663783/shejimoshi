package com.vip;

/**
 * @ClassName ObserverTest
 * @Description TODO
 * @Author zxx
 * @Date 2020/3/12 12:10
 * @Version 1.0
 **/
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");

        Question question = new Question();

        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景");
        gper.publishQuestion(question);
    }
}
