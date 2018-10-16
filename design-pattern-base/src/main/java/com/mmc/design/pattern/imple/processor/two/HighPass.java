package com.mmc.design.pattern.imple.processor.two;

import com.mmc.design.pattern.imple.processor.one.Waveform;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.two
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:06
 * @history: (version) author date desc
 */
public class HighPass implements Filter {

    private double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
