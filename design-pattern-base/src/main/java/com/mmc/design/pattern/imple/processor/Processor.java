package com.mmc.design.pattern.imple.processor;

/**
 * @packageName：com.mmc.design.pattern.imple.processor
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:49
 * @history: (version) author date desc
 */
public interface Processor {

    /**
     * 返回类名
     * @return
     */
    String name();

    /**
     * 返回执行结果
     * @param input
     * @return
     */
    Object process(Object input);
}
