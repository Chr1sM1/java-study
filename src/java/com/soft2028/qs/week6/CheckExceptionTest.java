package com.soft2028.qs.week6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName CheckExceptionTest
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/5
 **/
public class CheckExceptionTest {


    public static String formatTimeByDate(long timeStamp){
        //1.格式化对象
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.传入时间戳，创建Date对象
        Date date = new Date(timeStamp);
        //3.格式化date对象
        return df.format(date);
    }

    /**使用LocalDateTime和DateTimeFormat实现：线程安全
     *
     * @param timeStamp :入参为long类型的时间戳
     * @return String:格式化后的时间字符串
     */
    public static String formatTimeByLocalDateTime(long timeStamp) {
        Instant instant = Instant.ofEpochMilli(timeStamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant,zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localDateTime.format(formatter);
    }

}
