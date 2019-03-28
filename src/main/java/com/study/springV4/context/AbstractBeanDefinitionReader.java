package com.study.springV4.context;

import com.study.springV4.beans.BeanDefinitionRegistry;

public abstract class AbstractBeanDefinitionReader  implements BeanDefinitionReader {

    protected BeanDefinitionRegistry registry;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super();
        this.registry = registry;
    }
}
