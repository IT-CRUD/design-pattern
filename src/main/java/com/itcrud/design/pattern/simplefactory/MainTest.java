package com.itcrud.design.pattern.simplefactory;

import com.itcrud.design.pattern.simplefactory.coder.Coder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:06
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public class MainTest {

    private static CoderFactory coderFactory = new CoderFactoryImpl();

    public static void main(String[] args) {
        Coder  javaCoder = coderFactory.getCoder(CoderEnum.JAVA_CODER);
        System.out.println("我叫" + javaCoder.getName() + ",工作了" + javaCoder.getWorkAge() + "年");

        //-------

        Coder  pythonCoder = coderFactory.getCoder(CoderEnum.PYTHON_CODER);
        System.out.println("我叫" + pythonCoder.getName() + ",工作了" + pythonCoder.getWorkAge() + "年");
    }
}
