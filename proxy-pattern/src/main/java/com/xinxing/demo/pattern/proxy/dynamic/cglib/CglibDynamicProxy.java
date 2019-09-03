package com.xinxing.demo.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {

    public Object getProxyInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 动态代理，" + method.getName() + "被代理方法调用前。。。");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("Cglib 动态代理，" + method.getName() + "被代理方法调用后。。。");
        return result;
    }
}
