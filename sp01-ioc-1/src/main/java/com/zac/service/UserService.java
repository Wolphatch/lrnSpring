package com.zac.service;

import com.zac.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userdao);
}
