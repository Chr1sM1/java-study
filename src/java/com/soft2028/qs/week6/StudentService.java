package com.soft2028.qs.week6;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public interface StudentService {
    /**
     *
     * @param student :入参：学生对象
     * @return boolean :体检结果
     * @throws TooHeavyException
     */
    boolean checkHealth(Student student) throws TooHeavyException, NameException;
}
