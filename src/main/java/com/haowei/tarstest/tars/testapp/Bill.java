// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.haowei.tarstest.tars.testapp;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class Bill {

	@TarsStructProperty(order = 0, isRequire = true)
	public String parkName = "";
	@TarsStructProperty(order = 1, isRequire = true)
	public int payAmount = 0;
	@TarsStructProperty(order = 2, isRequire = true)
	public String plateNo = "";
	@TarsStructProperty(order = 3, isRequire = true)
	public String payTime = "";

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Bill() {
	}

	public Bill(String parkName, int payAmount, String plateNo, String payTime) {
		this.parkName = parkName;
		this.payAmount = payAmount;
		this.plateNo = plateNo;
		this.payTime = payTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(parkName);
		result = prime * result + TarsUtil.hashCode(payAmount);
		result = prime * result + TarsUtil.hashCode(plateNo);
		result = prime * result + TarsUtil.hashCode(payTime);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Bill)) {
			return false;
		}
		Bill other = (Bill) obj;
		return (
			TarsUtil.equals(parkName, other.parkName) &&
			TarsUtil.equals(payAmount, other.payAmount) &&
			TarsUtil.equals(plateNo, other.plateNo) &&
			TarsUtil.equals(payTime, other.payTime) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(parkName, 0);
		_os.write(payAmount, 1);
		_os.write(plateNo, 2);
		_os.write(payTime, 3);
	}


	public void readFrom(TarsInputStream _is) {
		this.parkName = _is.readString(0, true);
		this.payAmount = _is.read(payAmount, 1, true);
		this.plateNo = _is.readString(2, true);
		this.payTime = _is.readString(3, true);
	}

}
