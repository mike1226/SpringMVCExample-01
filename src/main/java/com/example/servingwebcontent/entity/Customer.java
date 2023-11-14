package com.example.servingwebcontent.entity;

import jakarta.annotation.Generated;

public class Customer {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.550902+09:00", comments = "Source field: public.customer.id")
	private String id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552784+09:00", comments = "Source field: public.customer.username")
	private String username;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552893+09:00", comments = "Source field: public.customer.email")
	private String email;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552994+09:00", comments = "Source field: public.customer.phone_number")
	private String phoneNumber;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.553138+09:00", comments = "Source field: public.customer.post_code")
	private String postCode;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.55244+09:00", comments = "Source field: public.customer.id")
	public String getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552729+09:00", comments = "Source field: public.customer.id")
	public void setId(String id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552823+09:00", comments = "Source field: public.customer.username")
	public String getUsername() {
		return username;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552861+09:00", comments = "Source field: public.customer.username")
	public void setUsername(String username) {
		this.username = username;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552927+09:00", comments = "Source field: public.customer.email")
	public String getEmail() {
		return email;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.552962+09:00", comments = "Source field: public.customer.email")
	public void setEmail(String email) {
		this.email = email;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.553027+09:00", comments = "Source field: public.customer.phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.553091+09:00", comments = "Source field: public.customer.phone_number")
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.553186+09:00", comments = "Source field: public.customer.post_code")
	public String getPostCode() {
		return postCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2023-11-14T00:52:28.553235+09:00", comments = "Source field: public.customer.post_code")
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
}