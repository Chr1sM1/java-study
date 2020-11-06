package com.soft2028.qs.week6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName CheckedException
 * @Description 编译时（可检查）的异常
 * @Author Chris
 * @Date 2020/11/5
 **/
public class CheckedException {
    public static void main(String[] args) {
        //以下两种方式可以得到服务器端long类型的时间戳
        //System.out.println(new Date().getTime());
        long timeStamp = System.currentTimeMillis();
        //将其类型转为yyyy-MM-dd HH:mm:ss格式，至少用两种方法：Date和LocalDataTime
        //----------使用Date和SimpleDateFormat实现：线程不安全-------------
        //1.格式化对象
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.传入时间戳，创建Data对象
        Date date = new Date(timeStamp);
        //3.格式化date对象
        String str = df.format(date);
        System.out.println(str);
        System.out.println("*********");
        //----------使用LocalDateTime和DateTimeFormat实现：线程安全-----------
        Instant instant = Instant.ofEpochMilli(timeStamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant,zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String result = localDateTime.format(formatter);
        System.out.println(result);

        //1.InterruptedException
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(Math.random()*100+1);
        }
        System.out.println(System.currentTimeMillis());


    }

}
