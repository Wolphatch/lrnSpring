package com.zac.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyLrn {
        public static void main(String[] args) {
            /*
            预先定义了Hello接口，和morning方法，但是不写实现类
            通过Proxy.newProxyInstance创建了一个Hello接口对象。
            参数是：
                使用的ClassLoader，通常就是接口类的ClassLoader；
                需要实现的接口数组，至少需要传入一个接口进去；
                用来处理接口方法调用的InvocationHandler实例。
            然后将这么个ProxyInstance强制转型为接口

             */
            InvocationHandler handler = new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println(method);
                    if (method.getName().equals("morning")) {
                        System.out.println("Good morning, " + args[0]);
                    }
                    return null;
                }
            };
            Hello hello = (Hello) Proxy.newProxyInstance(
                    Hello.class.getClassLoader(), // 传入ClassLoader
                    new Class[] { Hello.class }, // 传入要实现的接口
                    handler); // 传入处理调用方法的InvocationHandler
            hello.morning("Bob");
        }

    interface Hello {
        void morning(String name);
    }


}
