package com.zac.demo3;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setRent(landlord);

        Rent proxy = (Rent) pih.getProxy();
//        System.out.println(pih.getProxy().getClass());



        proxy.rent();
        proxy.sayHi();

    }


}
