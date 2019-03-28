package com.study.springV4.example;

import com.study.springV3.beans.DefaultBeanFactory;
import org.aspectj.weaver.tools.PointcutExpression;
import org.aspectj.weaver.tools.PointcutParser;
import org.aspectj.weaver.tools.ShadowMatch;
import org.aspectj.weaver.tools.TypePatternMatcher;

import java.lang.reflect.Method;

public class AspectJTest {
    public static void main(String[] args) throws Exception {
        PointcutParser pp = PointcutParser
                .getPointcutParserSupportingAllPrimitivesAndUsingContextClassloaderForResolution();
        TypePatternMatcher tpm = pp.parseTypePattern("com.study.springV3.*");
        PointcutExpression pe = pp.parsePointcutExpression("execution(* com.study.springV3.example.Driver.start*(..))");
        Class<?> cl = CCBean.class;
        Method aMethod = cl.getMethod("getName", null);
        ShadowMatch sm = pe.matchesMethodExecution(aMethod);
        System.out.println(sm.alwaysMatches());

        System.out.println(pe.couldMatchJoinPointsInType(cl));
        System.out.println(pe.couldMatchJoinPointsInType(DefaultBeanFactory.class));

        for (Method m : cl.getMethods()) {
            System.out.println(m.getName());
        }
    }

}
