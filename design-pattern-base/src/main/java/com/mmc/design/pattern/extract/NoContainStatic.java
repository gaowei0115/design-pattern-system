package com.mmc.design.pattern.extract;

/**
 * @packageName：com.mmc.design.pattern.extract
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:40
 * @history: (version) author date desc
 */
public class NoContainStatic {

    /**
     *
     * @param contain
     */
    public static void execute(NoContainAbstract contain) {
        NoContain noContain = (NoContain) contain;
        noContain.noContain();
    }

    /**
     *
     * @param withAbstract
     */
    public static void execute(WithAbstract withAbstract) {
        withAbstract.winthFun();
    }


    public static void main(String[] args) {
        execute(new NoContain());

        System.out.println("-------------------------------------------");

        execute(new WithMock());
    }
}
