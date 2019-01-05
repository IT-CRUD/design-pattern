package com.itcrud.design.pattern.adapter;

/**
 * @Author: YANGBAO352
 * @Desc:
 * @Date: 2018/8/9 17:19
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */

public class MainTest {

    public static void main(String[] args) {
        Client client = new Client();
        //听英语翻译
        client.doSay(1, "给朕笑一个！");
        //听法语翻译
        client.doSay(2, "给朕哭一个！");
    }
}
