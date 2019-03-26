package com.study.springV2.example;
import com.study.springV2.beans.BeanReference;
import com.study.springV2.beans.GenericBeanDefinition;
import com.study.springV2.beans.PreBuildBeanFactory;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public Test(String a, int b, char... c) {
        System.out.println(a + b + c);
    }


    static PreBuildBeanFactory bf = new PreBuildBeanFactory();

    public static void main(String[] args) throws Exception {
//        Class<?> c = Test.class;
//        Constructor ct = c.getConstructor(new Class<?>[] { String.class, int.class, char[].class });
//
//        System.out.println(ct);
//
//        Object instance = ct.newInstance(new Object[] { "aaaa", 4, new char[] { 'c' } });

        /*
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(GBean.class);
        List<Object> args1 = new ArrayList<>();
        args1.add(new String[]{"a","b"});
        bd.setConstructorArgumentValues(args1);
        bf.registerBeanDefinition("gbean", bd);
        GBean gBean = (GBean) bf.getBean("gbean");
        System.out.println(gBean.list);
        */

        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(HBean.class);
        List<Object> args1 = new ArrayList<>();
        args1.add("abean01");
        bd.setConstructorArgumentValues(args1);
        bf.registerBeanDefinition("hbean", bd);

        HBean hBean = (HBean) bf.getBean("hbean");
        System.out.println(hBean.name);
    }

}
