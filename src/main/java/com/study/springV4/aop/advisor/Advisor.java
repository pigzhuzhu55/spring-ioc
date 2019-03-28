package com.study.springV4.aop.advisor;

/*
通知者
(增强的功能)Advisor和Pointcut(切入点)的组合
 */
public interface Advisor {
    String getAdviceBeanName();

    String getExpression();
}
