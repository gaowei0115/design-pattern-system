package com.mmc.design.pattern.extend;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:38
 * @history: (version) author date desc
 */
public class Apply {

    public static void process(Processor processor, String s) {
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(s));
    }

    public static void main(String[] args) {
        String s = "Test Process String";

        process(new Upcase(), s);
        process(new LowCase(), s);
        process(new Splitter(), s);
    }
}
