package com.mmc.design.pattern.extend;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-24 14:48
 * @history: (version) author date desc
 */
public class C {

    public static void main(String[] args) {
        B b = new B();
        b.run();
    }

    static class A {
        public A() {
            System.out.println("init A....");
            run();
        }

        public void run() {
            System.out.println(".........A.run()");
        }
    }

    static class B extends A{
        private String param = "hello";

        public B() {
            System.out.println("init B....");
        }

        @Override
        public void run() {
            System.out.println("...........B.run() >> " + param);
        }
    }
}
