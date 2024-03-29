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
public class PageUtils {

	@TarsStructProperty(order = 0, isRequire = false)
	public long pageNo = 1;
	@TarsStructProperty(order = 1, isRequire = false)
	public long pageSize = 10;
	@TarsStructProperty(order = 2, isRequire = false)
	public long pageCount = 0;

	public long getPageNo() {
		return pageNo;
	}

	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public PageUtils() {
	}

	public PageUtils(long pageNo, long pageSize, long pageCount) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(pageNo);
		result = prime * result + TarsUtil.hashCode(pageSize);
		result = prime * result + TarsUtil.hashCode(pageCount);
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
		if (!(obj instanceof PageUtils)) {
			return false;
		}
		PageUtils other = (PageUtils) obj;
		return (
			TarsUtil.equals(pageNo, other.pageNo) &&
			TarsUtil.equals(pageSize, other.pageSize) &&
			TarsUtil.equals(pageCount, other.pageCount) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(pageNo, 0);
		_os.write(pageSize, 1);
		_os.write(pageCount, 2);
	}


	public void readFrom(TarsInputStream _is) {
		this.pageNo = _is.read(pageNo, 0, false);
		this.pageSize = _is.read(pageSize, 1, false);
		this.pageCount = _is.read(pageCount, 2, false);
	}

}
