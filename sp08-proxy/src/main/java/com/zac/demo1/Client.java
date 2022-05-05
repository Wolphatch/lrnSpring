package com.zac.demo1;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        //寻找proxy，输入landlord
        Proxy proxy = new Proxy(landlord);
        //通过代理执行rent
        proxy.rent();

    }
}
