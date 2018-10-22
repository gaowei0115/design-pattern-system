package com.mmc.design.pattern.adapt;

import java.util.Random;

/**
 * @packageName：com.mmc.design.pattern.adapt
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-22 17:28
 * @history: (version) author date desc
 */
public class RandomDoule {

    private static Random rand = new Random(47);

    public double next() {
       return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoule randomDoule = new RandomDoule();
        System.out.println(randomDoule.next());
    }


}
