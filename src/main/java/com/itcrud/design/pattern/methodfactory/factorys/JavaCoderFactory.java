package com.itcrud.design.pattern.methodfactory.factorys;

import com.itcrud.design.pattern.methodfactory.CoderFactory;
import com.itcrud.design.pattern.methodfactory.coder.Coder;
import com.itcrud.design.pattern.methodfactory.coder.JavaCoder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 19:55
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class JavaCoderFactory implements CoderFactory {
    @Override
    public Coder getCoder() {
        JavaCoder coder = new JavaCoder();
        coder.setName("Java软件工程师Joker");
        coder.setWorkAge(4);
        return coder;
    }
}
