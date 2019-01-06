package com.itcrud.design.pattern.singleton;

import com.itcrud.design.pattern.singleton.hunger.HungerSingleton;
import com.itcrud.design.pattern.singleton.innerclass.InnerClassSingleton;
import com.itcrud.design.pattern.singleton.lazy.LazySingleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 16:45
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class MainTest {

    private static HungerSingleton hungerSingleton = HungerSingleton.getInstance();
    private static InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
    private static LazySingleton lazySingleton = LazySingleton.getInstance();

    public static void main(String[] args) {
        hungerSingleton();
        innerClassSingleton();
        lazySingleton();
    }

    private static void hungerSingleton() {
        AtomicInteger count = hungerSingleton.getCount();
        count.incrementAndGet();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("操作结果：" + count.get());
    }

    private static void innerClassSingleton() {
        AtomicInteger count = innerClassSingleton.getCount();
        count.incrementAndGet();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("操作结果：" + count.get());
    }

    private static void lazySingleton() {
        AtomicInteger count = lazySingleton.getCount();
        count.incrementAndGet();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.incrementAndGet()).start();
        new Thread(() -> count.decrementAndGet()).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("操作结果：" + count.get());
    }
}
