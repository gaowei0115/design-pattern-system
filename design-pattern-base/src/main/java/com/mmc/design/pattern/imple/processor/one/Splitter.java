package com.mmc.design.pattern.imple.processor.one;

import com.mmc.design.pattern.imple.processor.Processor;

import java.util.Arrays;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.one
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:54
 * @history: (version) author date desc
 */
public class Splitter implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        String re = (String) input;
        return Arrays.toString(re.split(" "));
    }
}
