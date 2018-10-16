package com.mmc.design.pattern.extract;

/**
 * @packageName：com.mmc.design.pattern.extract
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:15
 * @history: (version) author date desc
 */
public class PrintTest extends PrintTestAbstaract {

    private int mark = 1;

    public PrintTest() {
        System.out.println(">>>>>>>>>> struct mark : " + mark);
    }

    @Override
    void print() {
        System.out.println("print mark : " + mark);
    }
}
