package com.mmc.design.pattern.factory;

import com.mmc.design.pattern.factory.demo1.ServiceFactory;
import com.mmc.design.pattern.factory.demo1.ServiceImpl1Factory;
import com.mmc.design.pattern.factory.demo1.ServiceImpl2Factory;

/**
 * @packageName：com.mmc.design.pattern.factory
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-23 17:41
 * @history: (version) author date desc
 */
public class ServiceApp {

    public static void consume(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        consume(new ServiceImpl1Factory());
        consume(new ServiceImpl2Factory());
    }
}
