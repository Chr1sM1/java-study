package insist.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TestCalendar
 * @Description 测试日历类
 * 在Calendar中，月份的表示是以0-11代表1-12月。
 * @Author Chris
 * @Date 2020/11/1
 **/
public class TestCalendar {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR,2020);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar cal2 = Calendar.getInstance();
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
        //加2天
        cal2.add(Calendar.DAY_OF_MONTH,2);
        //减3天
        cal2.add(Calendar.DAY_OF_MONTH,-3);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar cal3 = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);


    }
}
