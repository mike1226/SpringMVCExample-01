package com.example.servingwebcontent.entity;

import jakarta.annotation.Generated;

public class CountryEntity {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.56668+09:00", comments = "Source field: public.country.mstcountrycd")
	private String mstcountrycd;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.566921+09:00", comments = "Source field: public.country.mstcountrynanme")
	private String mstcountrynanme;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567064+09:00", comments = "Source field: public.country.updatedt")
	private Long updatedt;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567343+09:00", comments = "Source field: public.country.deletedt")
	private Long deletedt;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.566795+09:00", comments = "Source field: public.country.mstcountrycd")
	public String getMstcountrycd() {
		return mstcountrycd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.566855+09:00", comments = "Source field: public.country.mstcountrycd")
	public void setMstcountrycd(String mstcountrycd) {
		this.mstcountrycd = mstcountrycd;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.56697+09:00", comments = "Source field: public.country.mstcountrynanme")
	public String getMstcountrynanme() {
		return mstcountrynanme;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567022+09:00", comments = "Source field: public.country.mstcountrynanme")
	public void setMstcountrynanme(String mstcountrynanme) {
		this.mstcountrynanme = mstcountrynanme;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.56711+09:00", comments = "Source field: public.country.updatedt")
	public Long getUpdatedt() {
		return updatedt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567244+09:00", comments = "Source field: public.country.updatedt")
	public void setUpdatedt(Long updatedt) {
		this.updatedt = updatedt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567396+09:00", comments = "Source field: public.country.deletedt")
	public Long getDeletedt() {
		return deletedt;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.567596+09:00", comments = "Source field: public.country.deletedt")
	public void setDeletedt(Long deletedt) {
		this.deletedt = deletedt;
	}
}