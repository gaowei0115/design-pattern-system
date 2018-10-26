package com.mmc.design.load;

/**
 * @packageName：com.mmc.design.load
 * @desrciption: 通过classLoader方式加载
 * @author: gaowei
 * @date： 2018-10-24 15:21
 * @history: (version) author date desc
 */
public class ClassLoaderMock {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderMock.class.getClassLoader();
        try {
            classLoader.loadClass("com.mmc.design.load.Driver");
//            System.out.println(Driver.param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
