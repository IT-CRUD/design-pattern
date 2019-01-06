package com.itcrud.design.pattern.singleton.innerclass;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 21:11
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class InnerClassSingleton {

    private AtomicInteger count = new AtomicInteger(0);

    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public AtomicInteger getCount() {
        return count;
    }
}
