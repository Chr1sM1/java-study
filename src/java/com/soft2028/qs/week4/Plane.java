package com.soft2028.qs.week4;

/**
 * @ClassName Plane
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/29
 **/
public class Plane implements Fly {
    @Override
    public void fly(String name, int speed)
    {
        System.out.println(name+"飞行，时速"+speed);
    }
}
