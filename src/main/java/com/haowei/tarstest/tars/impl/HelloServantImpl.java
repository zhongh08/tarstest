package com.haowei.tarstest.tars.impl;

import com.haowei.tarstest.tars.HelloServant;
import com.qq.tars.spring.annotation.TarsServant;

@TarsServant("HelloObj")
public class HelloServantImpl implements HelloServant {

    @Override
    public String hello(int no, String name) {
        return String.format("hello no=%s, name=%s, time=%s", no, name, System.currentTimeMillis());
    }

    @Override
    public String hello2(String name) {
        return String.format("hello2 name=%s, time=%s", name, System.currentTimeMillis());
    }

}
