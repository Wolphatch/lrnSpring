package com.zac.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于 <beam id='user' class="com.zac.dao.User
@Component
public class User {
        @Value("zac")
        public String username;
}
