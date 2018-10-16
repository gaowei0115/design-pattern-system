package com.mmc.design.pattern.imple.processor.two;

import com.mmc.design.pattern.imple.processor.Processor;
import com.mmc.design.pattern.imple.processor.one.LowCase;
import com.mmc.design.pattern.imple.processor.one.Splitter;
import com.mmc.design.pattern.imple.processor.one.UpCase;
import com.mmc.design.pattern.imple.processor.one.Waveform;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.two
 * @desrciption: 通过适配器模式实现两个不同接口协议的互通
 * @author: gaowei
 * @date： 2018-10-16 16:09
 * @history: (version) author date desc
 */
public class Apply{

    public static void process(Processor processor, Object input) {
        System.out.println(processor.name());
        System.out.println(processor.process(input));
    }

    public static void main(String[] args) {
        String s = "There is a bill";
        Waveform waveform = new Waveform();
        process(new LowCase(), s);
        process(new UpCase(), s);
        process(new Splitter(), s);
        process(new FilterAdapter(new LowPass(12.12)), waveform);

        process(new FilterAdapter(new HighPass(234.23)), waveform);
    }

}
