package com.itcrud.design.pattern.adapter;

/**
 * @Author: YANGBAO352
 * @Desc:
 * @Date: 2018/8/9 17:47
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class EnglishFriend {

    //听的功能，并且只接受英文内容
    public void doListen(String content) {
        System.out.println(content);
    }
}
