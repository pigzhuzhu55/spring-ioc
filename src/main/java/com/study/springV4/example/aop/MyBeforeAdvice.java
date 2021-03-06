package com.study.springV4.example.aop;

import com.study.springV4.aop.advice.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(this + " 对 " + target + " 进行了前置增强！");
    }

}
