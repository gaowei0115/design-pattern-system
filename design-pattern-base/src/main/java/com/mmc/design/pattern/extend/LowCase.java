package com.mmc.design.pattern.extend;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:36
 * @history: (version) author date desc
 */
public class LowCase extends Processor {

    @Override
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
