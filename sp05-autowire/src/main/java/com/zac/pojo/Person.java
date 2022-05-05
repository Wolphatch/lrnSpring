package com.zac.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import javax.annotation.Resource;


public class Person {
    @Resource
    private Dog dog;
    @Resource(name="cat11")
    private Cat cat;
    private String name;


    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
