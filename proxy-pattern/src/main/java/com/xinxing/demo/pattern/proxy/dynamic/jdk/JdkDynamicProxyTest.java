package com.xinxing.demo.pattern.proxy.dynamic.jdk;

import com.xinxing.demo.pattern.proxy.DBExcutor;
import com.xinxing.demo.pattern.proxy.Person;
import com.xinxing.demo.pattern.proxy.Tenant;
import com.xinxing.demo.pattern.proxy.UserExecutor;
import java.util.List;

public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        {
            DBExcutor excutor = (DBExcutor) new JdkDynamicProxy().getProxyInstance(new UserExecutor());
            List<String> result = excutor.query();
            System.out.println("JDK 动态代理调用结果 >>>> " + result);
        }
        System.out.println("======================================================================================");
        {
            Person person = (Person) new JdkDynamicProxy().getProxyInstance(new Tenant());
            person.rentHouse();
            System.out.println("======================================================================================");
            person.flee();
        }
    }
}

