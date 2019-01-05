package com.itcrud.design.pattern.abstractfactory;

import com.itcrud.design.pattern.abstractfactory.bag.Bag;
import com.itcrud.design.pattern.abstractfactory.factory.AbstractFruitAndBagFactory;
import com.itcrud.design.pattern.abstractfactory.factory.AppleFactory;
import com.itcrud.design.pattern.abstractfactory.factory.BananaFactory;
import com.itcrud.design.pattern.abstractfactory.fruit.Fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:45
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class MainTest {

    private static AbstractFruitAndBagFactory fruitAndBagFactory;

    public static void main(String[] args) {
        fruitAndBagFactory = new AppleFactory();
        Fruit apple = fruitAndBagFactory.getFruit();//生产水果
        Bag appleBag = fruitAndBagFactory.getBag();//生产对应水果的包装盒
        System.out.println(apple.getName() + ",装在" + appleBag.getName());

        fruitAndBagFactory = new BananaFactory();
        Fruit banana = fruitAndBagFactory.getFruit();//生产水果
        Bag bananaBag = fruitAndBagFactory.getBag();//生产对应水果的包装盒
        System.out.println(banana.getName() + ",装在" + bananaBag.getName());
    }
}
