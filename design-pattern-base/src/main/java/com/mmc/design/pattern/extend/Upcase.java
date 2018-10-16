package com.mmc.design.pattern.extend;

/**
 * @packageName：com.mmc.design.pattern.extend
 * @desrciption: 转换成大写
 * @author: gaowei
 * @date： 2018-10-16 15:34
 * @history: (version) author date desc
 */
public class Upcase extends Processor {

    @Override
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
