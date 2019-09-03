package com.xinxing.demo.pattern.proxy;

import java.util.Arrays;
import java.util.List;

public class UserExecutor implements DBExcutor {

    public List<String> query() {
        List<String> users = Arrays.asList("张三", "李四", "王五", "赵六");
        System.out.println("正在查询数据库，result >>>> " +users.toString());
        return users;
    }
}
