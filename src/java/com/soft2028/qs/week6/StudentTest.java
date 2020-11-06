package com.soft2028.qs.week6;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = Student.builder().name("aaaaaa").weight(100).build();
        Student student2 = Student.builder().name("bbb").weight(181).build();
        Student student3 = Student.builder().name("ccc").weight(88).build();

        StudentService ss = new StudentServiceImpl();
        boolean flag = false;
        try{
            flag = ss.checkHealth(student1);
        }catch(TooHeavyException|NameException e){
            System.out.println(e.getMessage());
        }
        System.out.println(flag);
    }
}
