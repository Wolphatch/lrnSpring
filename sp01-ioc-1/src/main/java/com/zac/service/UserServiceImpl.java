package com.zac.service;

import com.zac.dao.UserDao;
import com.zac.service.UserService;

public class UserServiceImpl implements UserService{
    private UserDao userdao;

    public void setUserDao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void getUser(){
        userdao.getUser();
    }
}
