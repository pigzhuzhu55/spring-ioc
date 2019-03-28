package com.study.springV4.aop.pointcut;

import org.aspectj.weaver.tools.PointcutExpression;
import org.aspectj.weaver.tools.PointcutParser;
import org.aspectj.weaver.tools.ShadowMatch;

import java.lang.reflect.Method;

/*
切入点表达式
这里用第三方库aspectj做表达式解析
这个类匹不匹配、这个方法匹不匹配，要不要切入
 */
public class AspectJExpressionPointcut implements Pointcut {

    //切入点解析器
    private static PointcutParser pp = PointcutParser
            .getPointcutParserSupportingAllPrimitivesAndUsingContextClassloaderForResolution();

    private String expression;

    //通过解析表达式得到的切入点表达式对象
    private PointcutExpression pe;

    /*
    构造方法，给入表达式，解析对象
     */
    public AspectJExpressionPointcut(String expression) {
        super();
        this.expression = expression;
        pe = pp.parsePointcutExpression(expression);
    }

    //是否匹配类
    @Override
    public boolean matchsClass(Class<?> targetClass) {
        return pe.couldMatchJoinPointsInType(targetClass);
    }
    //是否匹配方法
    @Override
    public boolean matchsMethod(Method method, Class<?> targetClass) {
        ShadowMatch sm = pe.matchesMethodExecution(method);
        return sm.alwaysMatches();
    }

    public String getExpression() {
        return expression;
    }

}
