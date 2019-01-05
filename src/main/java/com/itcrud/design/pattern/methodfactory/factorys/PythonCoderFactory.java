package com.itcrud.design.pattern.methodfactory.factorys;

import com.itcrud.design.pattern.methodfactory.CoderFactory;
import com.itcrud.design.pattern.methodfactory.coder.Coder;
import com.itcrud.design.pattern.methodfactory.coder.PythonCoder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 20:21
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class PythonCoderFactory implements CoderFactory {
    @Override
    public Coder getCoder() {
        PythonCoder coder = new PythonCoder();
        coder.setName("Python软件工程师Tony");
        coder.setWorkAge(2);
        return coder;
    }
}
