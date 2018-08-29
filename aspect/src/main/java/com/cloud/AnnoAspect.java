package com.cloud;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by k on 2018/8/29.
 */
@Aspect
public class AnnoAspect {

    @Pointcut("@annotation(com.cloud.Annotation)")
    public void joinPoint(){

    }

    @Around("joinPoint()")
    public Object doPoint(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before doPoint");
        Object proceed = point.proceed();
        System.out.println("after doPoint");
        return proceed;
    }
}
