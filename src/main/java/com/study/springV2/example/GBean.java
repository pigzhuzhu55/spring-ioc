package com.study.springV2.example;

import java.util.List;

public class GBean {
    List<String> list;
    public GBean(String[] list){
        this.list =  java.util.Arrays.asList(list);
    }
}
