package com.mmc.design.pattern.extend;

import java.util.Arrays;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:37
 * @history: (version) author date desc
 */
public class Splitter extends Processor {

    @Override
    Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
