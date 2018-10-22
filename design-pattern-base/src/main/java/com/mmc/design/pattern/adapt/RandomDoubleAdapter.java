package com.mmc.design.pattern.adapt;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @packageName：com.mmc.design.pattern.adapt
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-22 17:36
 * @history: (version) author date desc
 */
public class RandomDoubleAdapter extends RandomDoule implements Readable{

    private int count;

    public RandomDoubleAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(Double.toString(next()) + " ");
        return 2;
    }

    public static void main(String[] args) {
        RandomDoubleAdapter randomDoubleAdapter = new RandomDoubleAdapter(5);
        Scanner scanner = new Scanner(randomDoubleAdapter);
        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
