package com.study.springV4.example;

public class ABeanFactory {
    public static ABean getABean(String name, CBean cb) {
        return new ABean(name, cb);
    }

    public ABean getABean2(String name, CBean cb) {
        return new ABean(name, cb);
    }

}
