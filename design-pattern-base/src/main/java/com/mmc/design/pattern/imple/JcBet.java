package com.mmc.design.pattern.imple;

/**
 * @packageName：com.mmc.design.pattern.imple
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 15:16
 * @history: (version) author date desc
 */
public class JcBet implements IBet {


    @Override
    public String bet(String param) {
        System.out.println(param + " betting process......");
        return "success";
    }
}
