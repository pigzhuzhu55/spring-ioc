package com.study.springV3.beans;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory bf);

}
