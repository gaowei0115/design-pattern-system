package com.mmc.design.pattern.imple.processor.one;

import com.mmc.design.pattern.imple.processor.Processor;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.one
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:56
 * @history: (version) author date desc
 */
public class LowPass implements Processor {

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Object input) {
        return (Waveform)input;
    }
}
