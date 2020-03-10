package com.template.course;

/**
 * @ClassName NetWorkCourse
 * @Description TODO
 * @Author zxx
 * @Date 2020/3/10 13:50
 * @Version 1.0
 **/
public abstract class NetWorkCourse {

    protected final void createCourse(){
        //发布预习资料
        this.postPreResource();

        //2 制作PPT 课件
        this.createPPT();

        //3 在线直播
        this.liveVideo();

        //4 提交课件
        this.postNode();

        //5 提交源码
        this.postSourse();

        //
        if (needHomeWork()){
            checkHomeWork();
        }
    }

    abstract void checkHomeWork() ;

    //钩子方法
    protected boolean needHomeWork() {
        return false;
    }

    final void postSourse() {
        System.out.println("提交源码");
    }

    final void postNode() {
        System.out.println("提交笔记");
    }

    final void liveVideo() {
        System.out.println("直播");
    }

    final void createPPT() {
        System.out.println("创建备课PPT");
    }


    final void postPreResource() {
        System.out.println("发布预习资料");
    }
}
