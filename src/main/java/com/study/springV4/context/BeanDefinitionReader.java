package com.study.springV4.context;

public interface BeanDefinitionReader {

    void loadBeanDefintions(Resource resource) throws Throwable;

    void loadBeanDefintions(Resource... resource) throws Throwable;

}
