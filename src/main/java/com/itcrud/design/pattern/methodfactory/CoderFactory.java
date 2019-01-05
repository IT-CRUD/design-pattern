package com.itcrud.design.pattern.methodfactory;

import com.itcrud.design.pattern.methodfactory.coder.Coder;

/**
 * @Author: Joker
 * @Desc:
 * @Date: 2019/1/5 19:55
 * @Modified By:
 * @Project_name: design-pattern
 * @Version 1.0
 */
public interface CoderFactory {
    Coder getCoder();
}
