package com.mmc.design.pattern.extract;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @packageName：com.mmc.design.pattern.extract
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 14:03
 * @history: (version) author date desc
 */
public class JcRuleTest {


    @Test
    public void executeRule() throws Exception {
        Rule rule = new JcRule();
        rule.executeRule();
    }

}