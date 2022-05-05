package com.zac.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//After returning advice is invoked only on normal method return, not if an exception is thrown.
// Such advice can see the return value, but cannot change it.
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable{
        System.out.println("执行了"+method.getName()+"方法 得到了返回值：" + returnValue);
    }
}
