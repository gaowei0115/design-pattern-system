package com.mmc.design.pattern.imple.multi;

/**
 * @packageName：com.mmc.design.pattern.imple.multi
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 17:34
 * @history: (version) author date desc
 */
public class Example14_InterfaceMutil {

    public  static void task01(Interface01 interface01) {
        interface01.fun01();
        interface01.gun01();
    }

    static void task02(Interface02 interface02) {
        interface02.fun02();
        interface02.gun02();
    }

    static void task03(Interface03 interface03) {
        interface03.fun03();
        interface03.gun03();
    }

    static void task04(Interface04 interface04) {
        interface04.h();
        interface04.fun01();
        interface04.gun01();
        interface04.fun02();
        interface04.gun02();
        interface04.fun03();
        interface04.gun03();
    }

    public static void main(String[] args) {
        AllMulti all = new AllMulti();
        task01(all);
        task02(all);
        task03(all);
        task04(all);
    }
}
