package com.xinxing.demo.design.pattern;

public class SingletonA {

    private static final SingletonA SINGLETON_A = new SingletonA();

    private SingletonA() {
    }

    public static SingletonA getInstance(){
        return SINGLETON_A;
    }
}
