package com.itcrud.design.pattern.builder.order;

import com.itcrud.design.pattern.builder.fruit.Fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 15:38
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class MemberFruitOrderBuilder implements FruitOrderBuilder {

    private Fruit apple;
    private Fruit banana;
    private Integer totalPrice = 0;
    private Integer discount = 15;//老会员立减15元

    public void addApple(Fruit apple) {
        this.apple = apple;
        this.totalPrice += apple.getPrice();
    }

    public void addBanana(Fruit banana) {
        this.banana = banana;
        this.totalPrice += banana.getPrice();
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }

    public Integer getDealPrice() {
        return this.totalPrice - this.discount;
    }
}
