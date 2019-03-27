package com.study.springV3.aop.advisor;


import com.study.springV3.aop.pointcut.AspectJExpressionPointcut;
import com.study.springV3.aop.pointcut.Pointcut;

/*
切面
 */
public class AspectJPointcutAdvisor implements PointcutAdvisor {

    private String adviceBeanName;

    private String expression;

    private AspectJExpressionPointcut pointcut;

    public AspectJPointcutAdvisor(String adviceBeanName, String expression) {
        super();
        this.adviceBeanName = adviceBeanName;
        this.expression = expression;
        this.pointcut = new AspectJExpressionPointcut(this.expression);
    }

    @Override
    public Pointcut getPointcut() {
        return this.pointcut;
    }

    @Override
    public String getAdviceBeanName() {
        return this.adviceBeanName;
    }

    @Override
    public String getExpression() {
        return this.expression;
    }

}
