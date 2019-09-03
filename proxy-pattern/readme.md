# proxy-pattern代理模式

## 1 cglib动态代理
```
com.xinxing.demo.pattern.proxy.dynamic.cglib
```
代理类需实现net.sf.cglib.proxy.MethodInterceptor接口

cglib原理是 生成一个继承代理对象的java类（**java特性，不能代理final方法**）

源码底层实现：net.sf.cglib.proxy.Enhancer（用于生成新的类），net.sf.cglib.proxy.MethodInterceptor

## 2 jdk动态代理
```
com.xinxing.demo.pattern.proxy.dynamic.jdk
```
代理类实现java.lang.reflect.InvocationHandler接口

jdk原理是 根据接口，生成过一个新的代理对象进行方法调用（**因此被代理对象必须实现含有需要代理的方法的接口**）

JDK源码底层实现：java.lang.reflect.Proxy（用于生成新的类，eg：$Proxy0）java.lang.reflect.InvocationHandler