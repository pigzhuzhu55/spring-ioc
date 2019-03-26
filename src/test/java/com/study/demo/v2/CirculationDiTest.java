package com.study.demo.v2;
import java.util.ArrayList;
import java.util.List;

import com.study.springV2.beans.BeanReference;
import com.study.springV2.beans.GenericBeanDefinition;
import com.study.springV2.beans.PreBuildBeanFactory;
import com.study.springV2.example.DBean;
import com.study.springV2.example.EBean;
import org.junit.Test;

/*
循环依赖注入
 */
public class CirculationDiTest {
    static PreBuildBeanFactory bf = new PreBuildBeanFactory();

    @Test
    public void testCirculationDI() throws Exception {
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(DBean.class);
        List<Object> args = new ArrayList<>();
        args.add(new BeanReference("ebean"));
        bd.setConstructorArgumentValues(args);
        bf.registerBeanDefinition("dbean", bd);

        bd = new GenericBeanDefinition();
        bd.setBeanClass(EBean.class);
        args = new ArrayList<>();
        args.add(new BeanReference("dbean"));
        bd.setConstructorArgumentValues(args);
        bf.registerBeanDefinition("ebean", bd);

        bf.preInstantiateSingletons();
    }

}
