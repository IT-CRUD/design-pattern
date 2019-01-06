package com.itcrud.design.pattern.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 21:11
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class LazySingleton {

    private AtomicInteger count = new AtomicInteger(0);

    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public AtomicInteger getCount() {
        return count;
    }
}
