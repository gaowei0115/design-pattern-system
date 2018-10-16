package com.mmc.design.pattern.extract;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @packageName：com.mmc.design.pattern.extract
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:19
 * @history: (version) author date desc
 */
public class PrintTestTest {
    @Test
    public void print() throws Exception {

        PrintTestAbstaract printTest = new PrintTest();
        printTest.print();
    }

}