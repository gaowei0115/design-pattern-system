package com.mmc.design.pattern.factory.demo1;

import com.mmc.design.pattern.factory.Service;

/**
 * @packageName：com.mmc.design.pattern.factory.demo1
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-23 17:18
 * @history: (version) author date desc
 */
public class ServiceImpl2 implements Service {
    @Override
    public void method1() {
        System.out.println("serviceImpl2.method1()");
    }

    @Override
    public void method2() {
        System.out.println("serviceImpl2.method2()");
    }
}
