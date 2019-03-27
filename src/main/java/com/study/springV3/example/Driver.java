package com.study.springV3.example;

public interface  Driver {

    void start();

    default void stop() {

    }
}

