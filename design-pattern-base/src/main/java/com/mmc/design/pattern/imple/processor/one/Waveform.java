package com.mmc.design.pattern.imple.processor.one;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.one
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:57
 * @history: (version) author date desc
 */
public class Waveform {

    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform" + id;
    }
}
