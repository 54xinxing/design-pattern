# singleton-pattern单例模式

> 破坏单例

1. 通过反射调用构造方法（构造方法抛异常拦截）

2. 序列化、反序列化（定义readResolve）


> 推荐使用枚举式单例（jdk底层实现保护枚举单例）