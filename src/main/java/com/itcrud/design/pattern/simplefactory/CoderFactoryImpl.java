package com.itcrud.design.pattern.simplefactory;

import com.itcrud.design.pattern.simplefactory.coder.Coder;
import com.itcrud.design.pattern.simplefactory.coder.JavaCoder;
import com.itcrud.design.pattern.simplefactory.coder.PythonCoder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:03
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class CoderFactoryImpl implements CoderFactory {
    @Override
    public Coder getCoder(CoderEnum coderEnum) {
        switch (coderEnum) {
            case JAVA_CODER:
                JavaCoder javaCoder = new JavaCoder();
                javaCoder.setName("Java软件工程师Joker");
                javaCoder.setWorkAge(4);
                return javaCoder;
            case PYTHON_CODER:
                PythonCoder pythonCoder = new PythonCoder();
                pythonCoder.setName("Python软件工程师Tony");
                pythonCoder.setWorkAge(2);
                return pythonCoder;
            default:
                return null;
        }
    }
}
