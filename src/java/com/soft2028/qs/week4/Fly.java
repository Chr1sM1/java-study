package com.soft2028.qs.week4;

/**
 * @ClassName Fly
 * @Description TODO
 * @Author Chris
 * @Date 2020/10/29
 **/
public interface Fly {
    String NAME ="飞行器";
    int SPEED =1000;

    /**
     * 飞行方法
     *
     * @param name
     * @param speed
     */
    void fly(String name, int speed);
}
