package com.haowei.tarstest.tars.impl;

import com.haowei.tarstest.tars.TestServant;
import com.qq.tars.spring.annotation.TarsServant;

@TarsServant("TestObj")
public class TestServantImpl implements TestServant {

    @Override
    public String test(String name) {
        return String.format("hello name=%s, time=%s", name, System.currentTimeMillis());
    }

}
