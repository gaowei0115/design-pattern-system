package com.mmc.design.pattern.extend;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:25
 * @history: (version) author date desc
 */
public class BusCar extends Car {

    private int count = 10;

    public BusCar() {
        System.out.println("busCar............");
    }

    @Override
    public void run() {
        System.out.println("bus car run...............>>" + count);
    }
}
