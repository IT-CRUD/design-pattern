package com.zdydoit.design.pattern.adapter;

public class FrenchTranslator implements Translator{

    private FrenchFriend friend = new FrenchFriend();

    //将中文内容翻译成法语
    public void translate(String content) {
        friend.doListen("Bonjour!");
    }
}