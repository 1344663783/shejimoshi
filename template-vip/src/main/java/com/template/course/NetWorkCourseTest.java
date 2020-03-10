package com.template.course;

/**
 * @ClassName NetWorkCourseTest
 * @Description TODO
 * @Author zxx
 * @Date 2020/3/10 14:03
 * @Version 1.0
 **/
public class NetWorkCourseTest {
    public static void main(String[] args) {
        System.out.println("-------java-----");
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();


        System.out.println("-------大数据-----");
        NetWorkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
