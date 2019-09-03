package com.xinxing.demo.design.pattern;

import java.io.ObjectInputStream;

public class SingletonB {

    private static SingletonB singletonB;

    static {
        singletonB = new SingletonB();
    }

    public static SingletonB getInstance() {
        return singletonB;
    }

}
