package com.study.springV3.aop;

import com.study.springV3.aop.advisor.Advisor;
import com.study.springV3.beans.BeanFactory;

import java.util.List;

public interface AopProxyFactory {
    AopProxy createAopProxy(Object bean, String beanName, List<Advisor> matchAdvisors, BeanFactory beanFactory)
            throws Throwable;

    /**
     * 获得默认的AopProxyFactory实例
     *
     * @return AopProxyFactory
     */
    static AopProxyFactory getDefaultAopProxyFactory() {
        return new DefaultAopProxyFactory();
    }

}
