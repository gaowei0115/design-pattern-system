package com.mmc.design.load;

/**
 * @packageName：com.mmc.design.load
 * @desrciption: 通过Class.forName()加载
 * @author: gaowei
 * @date： 2018-10-24 15:19
 * @history: (version) author date desc
 */
public class ClassForName {

    public static void main(String[] args) {
        try {
            ClassForName.class.getClassLoader().loadClass("com.mmc.design.load.Driver");
            System.out.println("----------------------");
            Class.forName("com.mmc.design.load.Driver");
//            System.out.println(Driver.param);
        } catch (Exception e) {

        }
    }
}
