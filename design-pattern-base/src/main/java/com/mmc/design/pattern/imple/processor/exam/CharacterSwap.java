package com.mmc.design.pattern.imple.processor.exam;

/**
 * @packageName：com.mmc.design.pattern.imple.processor.exam
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-16 16:17
 * @history: (version) author date desc
 */
public class CharacterSwap {

    static String swap(String input) {
        if (input != null && !input.equals("")) {
            StringBuffer sb = new StringBuffer(input);
            for (int i = 0; i < sb.toString().length() - 1; i+=2) {
                char c1 = input.charAt(i);
                char c2 = input.charAt(i + 1);
                sb.setCharAt(i, c2);
                sb.setCharAt(i + 1, c1);
            }
            return sb.toString();
        }
        return "";
    }
}
