package com.itcrud.design.pattern.methodfactory;

import com.itcrud.design.pattern.methodfactory.coder.Coder;
import com.itcrud.design.pattern.methodfactory.factorys.JavaCoderFactory;
import com.itcrud.design.pattern.methodfactory.factorys.PythonCoderFactory;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 20:34
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class MainTest {

    private static CoderFactory factory;

    public static void main(String[] args) {
        factory = new JavaCoderFactory();
        Coder javaCoder = factory.getCoder();
        System.out.println("我叫" + javaCoder.getName() + ",工作了" + javaCoder.getWorkAge() + "年");

        //-------

        factory = new PythonCoderFactory();
        Coder pythonCoder = factory.getCoder();
        System.out.println("我叫" + pythonCoder.getName() + ",工作了" + pythonCoder.getWorkAge() + "年");
    }
}
