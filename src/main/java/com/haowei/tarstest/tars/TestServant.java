package com.haowei.tarstest.tars;

import com.qq.tars.protocol.annotation.Servant;

@Servant
public interface TestServant {

    public String test(String name);

}
