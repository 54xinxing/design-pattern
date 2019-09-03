package com.xinxing.demo.pattern.proxy;

public class Tenant implements Person {

    @Override
    public void rentHouse() {
        System.out.println("我是租户，在租房子。。。");
    }

    @Override
    public void flee() {
        System.out.println("我是租户，缴不起房租，我要跑路了。。。");
    }
}
