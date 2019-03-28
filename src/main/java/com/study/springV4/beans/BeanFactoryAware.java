package com.study.springV4.beans;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory bf);

}
