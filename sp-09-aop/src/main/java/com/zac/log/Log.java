package com.zac.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//Advice invoked before a method is invoked. Such advices cannot prevent the method call proceeding, unless they throw a Throwable.
public class Log implements MethodBeforeAdvice{
     //method指的是要执行的目标对象（代理的接口）的方法. the method to be invoked
     // 参数 params to the method
     // target： 目标对象，target of the method invocation
     public void before(Method method, Object[] args, Object target) throws Throwable {
          System.out.println(target.getClass().getName() + "的" + method.getName() + "方法执行了");
     }
}
