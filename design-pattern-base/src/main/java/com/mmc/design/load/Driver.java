package com.mmc.design.load;

/**
 * @packageName：com.mmc.design.load
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-24 15:17
 * @history: (version) author date desc
 */
public class Driver {

    public static String param = "加载静态属性....";

    static {
        System.out.println("加载静态代码块....");
    }


}
