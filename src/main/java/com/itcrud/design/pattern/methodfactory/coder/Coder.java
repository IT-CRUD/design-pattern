package com.itcrud.design.pattern.methodfactory.coder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 20:22
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class Coder {
    private String name;
    private Integer workAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", workAge='" + workAge + '\'' +
                '}';
    }
}
