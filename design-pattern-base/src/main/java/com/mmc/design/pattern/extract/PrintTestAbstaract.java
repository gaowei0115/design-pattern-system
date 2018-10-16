package com.mmc.design.pattern.extract;

/**
 * @packageName：com.mmc.design.pattern.extract
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:14
 * @history: (version) author date desc
 */
public abstract class PrintTestAbstaract {

    public PrintTestAbstaract() {
        print();
    }

    /**
     * 输出
     */
    abstract void print();
}
