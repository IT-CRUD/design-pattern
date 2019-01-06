package com.itcrud.design.pattern.singleton.hunger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 21:10
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class HungerSingleton {

    private AtomicInteger count = new AtomicInteger(0);

    private static final HungerSingleton INSTANCE = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return INSTANCE;
    }

    public AtomicInteger getCount() {
        return count;
    }
}
