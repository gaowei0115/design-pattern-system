package com.mmc.design.pattern.imple.processor.two;

import com.mmc.design.pattern.imple.processor.one.Waveform;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.two
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:03
 * @history: (version) author date desc
 */
public interface Filter {

    String name();

    Waveform process(Waveform input);
}
