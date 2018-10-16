package com.mmc.design.pattern.imple.processor.exam;

import com.mmc.design.pattern.imple.processor.two.Apply;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.exam
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:22
 * @history: (version) author date desc
 */
public class Exam11App {

    public static void main(String[] args) {
        String s = "abcd";
        Apply.process(new CharacterAdapter(), s);
    }
}
