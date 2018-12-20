package com.zdydoit.design.pattern.adapter;


/**
 * @Author: YANGBAO352
 * @Desc:
 * @Date: 2018/8/9 17:13
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class Client {

    //小明将要说的话告诉翻译官
    public void doSay(Integer mark, String content) {
        Translator translator = null;
        if (isEnglish(mark)) {
            translator = new EnglishTranslator();
        } else if (isFrench(mark)) {
            translator = new FrenchTranslator();
        }
        if (translator != null) translator.translate(content);

    }

    private boolean isEnglish(Integer mark) {
        return (mark & 1) == 1;
    }
    private boolean isFrench(Integer mark) {
        return (mark & 1) == 0;
    }
}
