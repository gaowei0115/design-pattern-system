package com.mmc.design.pattern.extend;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:33
 * @history: (version) author date desc
 */
public class Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    /**
     * 处理操作
     * @param input
     * @return
     */
    Object process(Object input) {
        return input;
    }
}
