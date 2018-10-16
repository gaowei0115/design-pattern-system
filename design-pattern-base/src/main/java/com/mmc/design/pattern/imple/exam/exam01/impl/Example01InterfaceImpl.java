package com.mmc.design.pattern.imple.exam.exam01.impl;

import com.mmc.design.pattern.imple.exam.exam01.Example01Inteface;

/**
 * @packageName：com.mmc.design.pattern.imple.exam.exam01.impl
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:19
 * @history: (version) author date desc
 */
public class Example01InterfaceImpl implements Example01Inteface {

    @Override
    public void printF() {
        System.out.println("example01 printF().....");
    }

    @Override
    public void printG() {
        System.out.println("example01 printG().....");
    }

    @Override
    public void printM() {
        System.out.println("example01 printM().....");
    }
}
