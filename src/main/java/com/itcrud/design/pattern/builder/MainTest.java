package com.itcrud.design.pattern.builder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 22:01
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class MainTest {

    private static BuilderDirector builderDirector = new BuilderDirector();

    public static void main(String[] args) {
        builderDirector.build();
    }

}
