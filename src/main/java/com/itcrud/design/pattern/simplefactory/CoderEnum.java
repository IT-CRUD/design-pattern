package com.itcrud.design.pattern.simplefactory;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 20:25
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public enum CoderEnum {

    JAVA_CODER("JAVA","JAVA工程师"),
    PYTHON_CODER("PYTHON","PYTHON工程师");

    CoderEnum(String lang,String desc){
        this.lang = lang;
        this.desc = desc;
    }

    private String lang;
    private String desc;
}
