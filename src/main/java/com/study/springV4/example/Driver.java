package com.study.springV4.example;

public interface  Driver {

    void start();

    default void stop() {

    }
}

