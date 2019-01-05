package com.itcrud.design.pattern.simplefactory;


import com.itcrud.design.pattern.simplefactory.coder.Coder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 21:01
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public interface CoderFactory {
    Coder getCoder(CoderEnum coderEnum);
}
