package com.mmc.design.pattern.extend;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:26
 * @history: (version) author date desc
 */
public class BusCarTest {
    @Test
    public void run() throws Exception {

        Car car = new BusCar();
        car.run();
    }

}