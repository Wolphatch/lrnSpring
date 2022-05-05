package com.zac.service;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("Add~");
    }

    @Override
    public void delete() {
        System.out.println("Delete~");
    }

    @Override
    public Boolean update() {
        System.out.println("Update~");
        return true;
    }

    @Override
    public void query() {
        System.out.println("Query~");
    }
}
