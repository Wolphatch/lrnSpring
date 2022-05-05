package com.zac.demo2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Client {
    public static void main(String[] args) throws NoSuchFieldException {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();


    }
}
