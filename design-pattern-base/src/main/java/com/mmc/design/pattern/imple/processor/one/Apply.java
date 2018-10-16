package com.mmc.design.pattern.imple.processor.one;

import com.mmc.design.pattern.imple.processor.Processor;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.one
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:01
 * @history: (version) author date desc
 */
public class Apply {

    public static void process(Processor processor, Object obj) {
        System.out.println(processor.name());
        System.out.println(processor.process(obj));
    }

    public static void main(String[] args) {
        String s = "There is a bill";
        Waveform waveform = new Waveform();
        process(new LowCase(), s);
        process(new UpCase(), s);
        process(new Splitter(), s);
        process(new LowPass(), waveform);
    }
}
