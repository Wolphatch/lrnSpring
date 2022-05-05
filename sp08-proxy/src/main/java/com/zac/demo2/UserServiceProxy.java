package com.zac.demo2;

public class UserServiceProxy {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add(){
        userService.add();
        System.out.println("Add from Proxy");
    };

    public void update(){
        userService.update();
        System.out.println("Update from Proxy");
    };

    public void delete(){
        userService.delete();
        System.out.println("Delete from Proxy");
    };

    public void check(){
        userService.check();
        System.out.println("Check from Proxy");
    };
}

