package com.mmc.design.pattern.imple.exam.exam01;

import com.mmc.design.pattern.imple.exam.exam01.impl.Example01InterfaceImpl;

/**
 * @packageName：com.mmc.design.pattern.imple.exam.exam01
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:23
 * @history: (version) author date desc
 */
public class Example01App {

    public static void main(String[] args) {
        Example01Inteface example01Inteface = new Example01InterfaceImpl();
        example01Inteface.printF();
        example01Inteface.printG();
        example01Inteface.printM();
    }
}
