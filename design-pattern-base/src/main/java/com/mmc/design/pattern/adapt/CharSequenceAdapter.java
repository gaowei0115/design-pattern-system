package com.mmc.design.pattern.adapt;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @packageName：com.mmc.design.pattern.adapt
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-22 17:49
 * @history: (version) author date desc
 */
public class CharSequenceAdapter extends CharSequence implements Readable {

    private int count;

    public CharSequenceAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        char[] buffer = gengerate();
        cb.put(buffer);
        return buffer.length;
    }

    public static void main(String[] args) {
        CharSequenceAdapter charSequenceAdapter = new CharSequenceAdapter(10);
        Scanner scanner = new Scanner(charSequenceAdapter);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
