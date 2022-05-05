package com.zac.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.zac.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("---在程序执行前---");
    }

    @Before("execution(* com.zac.service.UserServiceImpl.add(..))")
    public void beforeAdd(){
        System.out.println("---在add程序执行前---");
    }
    @After("execution(* com.zac.service.UserServiceImpl.add(..))")
    public void afterDelete(){
        System.out.println("---在delete程序执行后---");
    }

    @Around("execution(* com.zac.service.UserServiceImpl.update(..))")
    public void aroundUpdate(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        Object proceed = jp.proceed(); //执行update方法
        if (proceed.equals(true)){
            System.out.println("返回了true");
        }
        System.out.println("环绕后");
    }
}
