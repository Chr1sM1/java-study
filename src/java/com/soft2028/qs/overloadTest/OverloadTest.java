package com.soft2028.qs.overloadTest;

/**
 * @ClassName OverloadTest
 * @Description 重载练习
 * @Author Chris
 * @Date 2020/10/22
 **/
public class OverloadTest {
    public static String sum(int a,int b){
        int s = a + b ;
        int h=0,m=0;
        if(s>=60)
        {
            m=s/60;
            s=s%60;
        }
        if(m>=60)
        {
            h=m/60;
            m=m%60;
        }
        return h+"时 "+m+"分 "+s+"秒 ";

    }


    public static void main(String arg[])
    {

        System.out.println(sum(900,30));


    }



}
