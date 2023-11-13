package com.example.servingwebcontent.entity;

import jakarta.annotation.Generated;

public class ProvinceEntity {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569715+09:00", comments = "Source field: public.province.provcode")
	private String provcode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569855+09:00", comments = "Source field: public.province.mstcountrycd")
	private String mstcountrycd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569983+09:00", comments = "Source field: public.province.provname")
	private String provname;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569767+09:00", comments = "Source field: public.province.provcode")
	public String getProvcode() {
		return provcode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569815+09:00", comments = "Source field: public.province.provcode")
	public void setProvcode(String provcode) {
		this.provcode = provcode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.5699+09:00", comments = "Source field: public.province.mstcountrycd")
	public String getMstcountrycd() {
		return mstcountrycd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.569945+09:00", comments = "Source field: public.province.mstcountrycd")
	public void setMstcountrycd(String mstcountrycd) {
		this.mstcountrycd = mstcountrycd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570037+09:00", comments = "Source field: public.province.provname")
	public String getProvname() {
		return provname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.570081+09:00", comments = "Source field: public.province.provname")
	public void setProvname(String provname) {
		this.provname = provname;
	}
}