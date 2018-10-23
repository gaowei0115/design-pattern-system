package com.mmc.design.pattern.imple;

import java.util.Random;

/**
 * @packageName：com.mmc.design.pattern.imple
 * @desrciption: 接口中定义属性域 不能赋空值 可以被非常量表达式赋值
 * @author: gaowei
 * @date： 2018-10-23 16:46
 * @history: (version) author date desc
 */
public interface RandomVals {

    Random random = new Random(47);

    int random_int = random.nextInt();
    long random_long = random.nextLong();
    float random_float = random.nextFloat();
    double random_double = random.nextDouble();



}
