package com.haowei.tarstest.tars.impl;

import com.haowei.tarstest.tars.testapp.*;
import com.qq.tars.common.support.Holder;
import com.qq.tars.protocol.tars.annotation.TarsHolder;
import com.qq.tars.spring.annotation.TarsServant;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public int findBillList(FindBillListReq req, @TarsHolder Holder<BillRsp> rsp) {
        RspHeader rh = new RspHeader();

        BillRsp billRsp = new BillRsp();

        Bill bill = new Bill();
        bill.setParkName("停车场名称");
        bill.setPayAmount(500);
        bill.setPlateNo("粤B12345");
        bill.setPayTime("2019-08-15 09:00:00");

        List<Bill> billList = new ArrayList<Bill>();
        billList.add(bill);

        billRsp.setBillList(billList);

        rh.setIRet(0);
        billRsp.setRspHeader(rh);

        PageUtils page = req.getPage();
        billRsp.setPageUtils(page);

        rsp.value = billRsp;

        return 0;
    }
}
