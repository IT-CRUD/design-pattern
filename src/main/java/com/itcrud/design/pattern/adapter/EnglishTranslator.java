package com.itcrud.design.pattern.adapter;

public class EnglishTranslator implements Translator{

    private EnglishFriend friend = new EnglishFriend();

    //将中文转换成英语，告诉英国朋友
    public void translate(String content){
        friend.doListen("Hello!");
    }
}