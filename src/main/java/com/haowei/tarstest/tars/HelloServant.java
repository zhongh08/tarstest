package com.haowei.tarstest.tars;

import com.qq.tars.protocol.annotation.Servant;

@Servant
public interface HelloServant {

    public String hello(int no, String name);

    public String hello2(String name);

}
