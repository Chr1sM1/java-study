package com.soft2028.qs.week6;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public class StudentServiceImpl implements StudentService{
    @Override
    public boolean checkHealth(Student student) throws TooHeavyException,NameException{
        if(student.getWeight()>100){
            throw new TooHeavyException("体重超重！");
        }else if(student.getName().length()!=3){
            throw new NameException("姓名错误！！");
        }else{
            return true;
        }

    }
}
