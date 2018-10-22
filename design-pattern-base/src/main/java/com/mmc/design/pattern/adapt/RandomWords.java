package com.mmc.design.pattern.adapt;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @packageName：com.mmc.design.pattern.adapt
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-22 17:07
 * @history: (version) author date desc
 */
public class RandomWords implements Readable {

    private static Random random = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQLSTUVWXYZ".toCharArray();
    private static final char[] lows = "abcdefghijklmnopqlstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();

    private int count;

    public RandomWords(int count) {
        this.count = count;
    }


    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[random.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lows[random.nextInt(lows.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomWords(1));
        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
