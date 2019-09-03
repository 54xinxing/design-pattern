package com.xinxing.demo.pattern.proxy.dynamic.cglib;

import com.xinxing.demo.pattern.proxy.*;
import com.xinxing.demo.pattern.proxy.dynamic.jdk.JdkDynamicProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class CglibDynamicProxyTest {

    public static void main(String[] args) {
        {
            DBExcutor dbExcutor = (DBExcutor) new CglibDynamicProxy().getProxyInstance(UserExecutor.class);
            List<String> result = dbExcutor.query();
            System.out.println("Cglib 动态代理调用结果 >>>> " + result);

        }
        System.out.println("======================================================================================");
        {
            Person person = (Person) new CglibDynamicProxy().getProxyInstance(Tenant.class);
            person.rentHouse();
            System.out.println("======================================================================================");
            person.flee();
        }
        System.out.println("======================================================================================");
        {
            DevelopmentEngineer developmentEngineer = (DevelopmentEngineer) new CglibDynamicProxy().getProxyInstance(DevelopmentEngineer.class);
            developmentEngineer.code();
        }
    }
}

