package com.mmc.design.pattern.imple.processor.two;

import com.mmc.design.pattern.imple.processor.Processor;
import com.mmc.design.pattern.imple.processor.one.Waveform;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.two
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:07
 * @history: (version) author date desc
 */
public class FilterAdapter implements Processor {

    private Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
