package com.itcrud.design.pattern.abstractfactory.factory;

import com.itcrud.design.pattern.abstractfactory.bag.Bag;
import com.itcrud.design.pattern.abstractfactory.bag.BananaBag;
import com.itcrud.design.pattern.abstractfactory.fruit.Banana;
import com.itcrud.design.pattern.abstractfactory.fruit.Fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:48
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class BananaFactory extends AbstractFruitAndBagFactory {

    @Override
    public Fruit getFruit() {
        Banana banana = new Banana();
        banana.setName("香蕉");
        return banana;
    }

    @Override
    public Bag getBag() {
        BananaBag bananaBag = new BananaBag();
        bananaBag.setName("香蕉包装盒");
        return bananaBag;
    }
}
