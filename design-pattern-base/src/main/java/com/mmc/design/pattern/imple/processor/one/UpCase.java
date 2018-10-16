package com.mmc.design.pattern.imple.processor.one;

import com.mmc.design.pattern.imple.processor.Processor;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.one
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:51
 * @history: (version) author date desc
 */
public class UpCase implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        String re = (String) input;
        return re.toUpperCase();
    }
}
