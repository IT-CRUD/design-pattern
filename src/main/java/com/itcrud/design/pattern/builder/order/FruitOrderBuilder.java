package com.itcrud.design.pattern.builder.order;

import com.itcrud.design.pattern.builder.fruit.Fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 15:47
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public interface FruitOrderBuilder {
    void addApple(Fruit apple);
    void addBanana(Fruit banana);
    Integer getDealPrice();
    Integer getTotalPrice();
}
