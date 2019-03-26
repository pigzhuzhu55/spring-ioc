package com.study.springV1.beans;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
提前实例化单例模式的bean，扩展默认实例化工厂
优点：线程安全、
缺点：程序第一次加载慢、占内存
 */
public class PreBuildBeanFactory extends DefaultBeanFactory{
    private final Log logger = LogFactory.getLog(getClass());

    private List<String> beanNames = new ArrayList<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
            throws BeanDefinitionRegistException {
        super.registerBeanDefinition(beanName, beanDefinition);
        synchronized (beanNames) {
            beanNames.add(beanName);
        }
    }

    public void preInstantiateSingletons() throws Exception {
        synchronized (beanNames) {
            for (String name : beanNames) {
                BeanDefinition bd = this.getBeanDefinition(name);
                if (bd.isSingleton()) {
                    //调用一次，实际上就初始化了，内部实现是把单例模式的对象加到beanMap里面
                    this.doGetBean(name);
                    if (logger.isDebugEnabled()) {
                        logger.debug("preInstantiate: name=" + name + " " + bd);
                    }
                }
            }
        }
    }

}
