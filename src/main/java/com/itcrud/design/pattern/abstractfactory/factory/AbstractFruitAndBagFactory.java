package com.itcrud.design.pattern.abstractfactory.factory;

import com.itcrud.design.pattern.abstractfactory.bag.Bag;
import com.itcrud.design.pattern.abstractfactory.fruit.Fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:46
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public abstract class AbstractFruitAndBagFactory {

    public abstract Fruit getFruit();
    public abstract Bag getBag();
}
