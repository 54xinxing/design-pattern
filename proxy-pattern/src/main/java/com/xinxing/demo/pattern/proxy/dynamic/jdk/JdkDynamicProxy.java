package com.xinxing.demo.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy implements InvocationHandler {

    private Object target;

    public Object getProxyInstance(Object target){
        this.target = target;
        Class<?> targetClazz = target.getClass();
        return Proxy.newProxyInstance(targetClazz.getClassLoader(), targetClazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK 动态代理，" + method.getName() + "被代理方法调用前。。。");
        Object result = method.invoke(target, args);
        System.out.println("JDK 动态代理，" + method.getName() + "被代理方法调用后。。。");
        return result;
    }
}
