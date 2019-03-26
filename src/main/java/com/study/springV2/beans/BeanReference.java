package com.study.springV2.beans;

public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        super();
        this.beanName = beanName;
    }

    /**
     * 获得引用的beanName
     *
     * @return
     */
    public String getBeanName() {
        return this.beanName;
    }

}
