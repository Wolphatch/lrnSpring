package com.zac.demo1;

public class Proxy implements Rent {
    private Landlord landlord;
    public Proxy(){
    }

    public Proxy(Landlord landlord){
        this.landlord = landlord;
    }

    public void rent(){
        this.landlord.rent();
    }
}
