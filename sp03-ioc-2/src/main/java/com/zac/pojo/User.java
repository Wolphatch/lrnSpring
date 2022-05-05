package com.zac.pojo;

public class User {
    private String username;

    public User(){
        System.out.println("Constructor!");
    }

    public User(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void show(){
        System.out.println("name "+this.username);
    }
}
