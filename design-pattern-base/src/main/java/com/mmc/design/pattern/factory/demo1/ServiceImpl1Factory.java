package com.mmc.design.pattern.factory.demo1;

import com.mmc.design.pattern.factory.Service;

/**
 * @packageName：com.mmc.design.pattern.factory.demo1
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-23 17:40
 * @history: (version) author date desc
 */
public class ServiceImpl1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new ServiceImpl1();
    }
}
