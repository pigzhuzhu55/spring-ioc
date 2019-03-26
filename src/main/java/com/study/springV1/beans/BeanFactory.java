package com.study.springV1.beans;

/*
Bean工厂接口
 */
public interface BeanFactory {
    /**
     * 获取bean
     *
     * @param name
     *            bean的名字
     * @return bean 实例
     * @throws Exception
     */
    Object getBean(String name) throws Exception;

}
