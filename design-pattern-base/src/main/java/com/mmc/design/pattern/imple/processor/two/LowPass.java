package com.mmc.design.pattern.imple.processor.two;

import com.mmc.design.pattern.imple.processor.one.Waveform;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.two
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:04
 * @history: (version) author date desc
 */
public class LowPass implements Filter {

    private double cutoff;

    public LowPass(double cutoff) {
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
