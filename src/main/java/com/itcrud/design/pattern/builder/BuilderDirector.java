package com.itcrud.design.pattern.builder;

import com.itcrud.design.pattern.builder.fruit.Apple;
import com.itcrud.design.pattern.builder.fruit.Banana;
import com.itcrud.design.pattern.builder.order.FruitOrderBuilder;
import com.itcrud.design.pattern.builder.order.HolidayFruitOrderBuilder;
import com.itcrud.design.pattern.builder.order.MemberFruitOrderBuilder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 15:34
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class BuilderDirector {

    private FruitOrderBuilder orderBuilder;

    public void build() {
        orderBuilder = new MemberFruitOrderBuilder();//会员订单构建者
        addApple();
        addBanana();
        System.out.println("原价：" + orderBuilder.getTotalPrice() + "，会员价：" + orderBuilder.getDealPrice());

        //-----

        orderBuilder = new HolidayFruitOrderBuilder();//节日订单构建者
        addApple();
        addBanana();
        System.out.println("原价：" + orderBuilder.getTotalPrice() + "，节日价：" + orderBuilder.getDealPrice());
    }

    private void addApple() {
        orderBuilder.addApple(Apple.builder().price(100).build());//添加苹果
    }

    private void addBanana() {
        orderBuilder.addBanana(Banana.builder().price(80).build());//添加香蕉
    }
}
