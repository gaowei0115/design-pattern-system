package com.mmc.design.pattern.adapt;

import java.util.Random;

/**
 * @packageName：com.mmc.design.pattern.adapt
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-22 17:43
 * @history: (version) author date desc
 */
public class CharSequence {

    private static Random random = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQLSTUVWXYZ".toCharArray();
    private static final char[] lows = "abcdefghijklmnopqlstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();

    public char[] gengerate() {
        char[] buffer = new char[10];

        int idx = 0;
        buffer[idx++] = capitals[random.nextInt(capitals.length)];

        for (int i = 0; i < 4; i++) {
            buffer[idx++] = vowels[random.nextInt(vowels.length)];
            buffer[idx++] = lows[random.nextInt(lows.length)];
        }
        buffer[idx++] = ' ';
        return buffer;
    }
}
