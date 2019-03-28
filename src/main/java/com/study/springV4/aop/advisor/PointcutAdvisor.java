package com.study.springV4.aop.advisor;

import com.study.springV4.aop.pointcut.Pointcut;

/*
获得poincut的单独接口
 */
public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();

}
