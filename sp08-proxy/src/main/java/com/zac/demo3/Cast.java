package com.zac.demo3;

public class Cast {
    public static void main(String[] args) {
        A(new Son1());

    }
    public static void A(Father son){
        son.eat();
    }
}

class Father {
    public void eat(){
        System.out.println("我是父类的方法吃。。。。。");
    }
}

class Son extends Father{
    public void eat(){
        System.out.println("我是Son的方法吃。。。。。");
    }
    public void sleep(){
        System.out.println("Son睡觉");
    }
}

class Son1 extends Father {
    public void eat(){
        System.out.println("son1 的eat方法");
    }
    public void sleep(){
        System.out.println("son1 的sleep方法");
    }
}
