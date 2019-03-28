package com.study.springV4.context;

import com.study.springV4.beans.BeanFactory;
import com.study.springV4.beans.BeanPostProcessor;
import com.study.springV4.beans.PreBuildBeanFactory;

public  abstract class AbstractApplicationContext implements ApplicationContext {

    protected BeanFactory beanFactory;

    public AbstractApplicationContext() {
        super();
        this.beanFactory = new PreBuildBeanFactory();
    }

    @Override
    public Object getBean(String name) throws Throwable {
        return beanFactory.getBean(name);
    }

    @Override
    public void registerBeanPostProcessor(BeanPostProcessor bpp) {
        this.beanFactory.registerBeanPostProcessor(bpp);
    }

}
