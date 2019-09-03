package com.xinxing.demo.design.pattern;

import java.io.Serializable;

public class SingletonC implements Serializable {

    private static SingletonC singletonC = null;

    private SingletonC() {
    }

    public static SingletonC getInstance(){
        if (singletonC == null) {
            synchronized (SingletonC.class) {
                if (singletonC == null) {
                    singletonC = new SingletonC();
                }
            }
        }
        return singletonC;
    }

    private Object readResolve() {
        return singletonC;
    }
}
