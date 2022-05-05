package com.zac.pojo;

import com.zac.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//这个也会spring容器托管，注册到容器中，因为其本身也是@component
//@Configuration代表这是一个配置类，类似于beans.xml
@Configuration
@ComponentScan("com.zac.pojo")
public class Config {
    @Bean
    //相当于bean标签
    //方法的名字就相当于bean标签的id属性
    //返回值就相当于标签的class属性
    public User user(){
        return new User();
    }
}
