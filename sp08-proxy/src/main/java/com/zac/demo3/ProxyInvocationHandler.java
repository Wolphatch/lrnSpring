package com.zac.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用来自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    //所有interface类型的变量总是通过某个实例向上转型并赋值给接口类型变量的：
    private Rent rent; //这是个接口类型的变量

    public void setRent(Rent rent) {
        this.rent = rent;
//        System.out.println(this.rent.getClass()); //class com.zac.demo3.Landlord
    }

    //生成代理类
    public Object getProxy(){
        //接口的classloader，要实现的接口， 传入处理调用方法的InvocationHandler
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                this.rent.getClass().getInterfaces(), this);
    }

    @Override
    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //使用反射实现动态代理
        Object result = method.invoke(this.rent, args);
        return null;
    }

}
