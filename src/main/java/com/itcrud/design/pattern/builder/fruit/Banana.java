package com.itcrud.design.pattern.builder.fruit;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/6 15:36
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class Banana extends Fruit {

    public static class Builder {

        private Integer price;

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Banana build() {
            Banana banana = new Banana();
            banana.setPrice(this.price);
            return banana;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
