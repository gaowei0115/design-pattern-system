package com.mmc.design.pattern.imple.processor.exam;

import com.mmc.design.pattern.imple.processor.Processor;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.exam
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:21
 * @history: (version) author date desc
 */
public class CharacterAdapter implements Processor {
    @Override
    public String name() {
        return CharacterSwap.class.getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return CharacterSwap.swap((String)input);
    }
}
