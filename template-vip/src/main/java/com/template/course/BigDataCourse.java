package com.template.course;

/**
 * @ClassName BigDataCourse
 * @Description TODO
 * @Author zxx
 * @Date 2020/3/10 14:00
 * @Version 1.0
 **/
public class BigDataCourse extends NetWorkCourse {

    private boolean needHomeWorkFlag = false;

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWorkFlag;
    }
}
