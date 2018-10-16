package com.mmc.design.pattern.imple.multi;

/**
 * @packageName：com.mmc.design.pattern.imple.multi
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 17:31
 * @history: (version) author date desc
 */
public class AllMulti extends MultiInterface implements Interface04 {

    public AllMulti() {
        super("All");
    }

    @Override
    public void fun01() {
        System.out.println("print All.fun01");
    }

    @Override
    public void gun01() {
        System.out.println("print All.gun01");
    }

    @Override
    public void fun02() {
        System.out.println("print All.fun02");
    }

    @Override
    public void gun02() {
        System.out.println("print All.gun02");
    }

    @Override
    public void fun03() {
        System.out.println("print All.fun03");
    }

    @Override
    public void gun03() {
        System.out.println("print All.gun03");
    }

    @Override
    public void h() {
        System.out.println("print All.h");
    }
}
