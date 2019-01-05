package com.itcrud.design.pattern.abstractfactory.factory;

import com.itcrud.design.pattern.abstractfactory.bag.AppleBag;
import com.itcrud.design.pattern.abstractfactory.bag.Bag;
import com.itcrud.design.pattern.abstractfactory.fruit.Apple;
import com.itcrud.design.pattern.abstractfactory.fruit.Fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:47
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class AppleFactory extends AbstractFruitAndBagFactory {

    @Override
    public Fruit getFruit() {
        Apple apple = new Apple();
        apple.setName("苹果");
        return apple;
    }

    @Override
    public Bag getBag() {
        AppleBag appleBag = new AppleBag();
        appleBag.setName("苹果包装盒");
        return appleBag;
    }
}
