package com.example.servingwebcontent.entity;

import jakarta.annotation.Generated;

public class Customer {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.300699+09:00", comments="Source field: public.customer.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301046+09:00", comments="Source field: public.customer.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301144+09:00", comments="Source field: public.customer.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301245+09:00", comments="Source field: public.customer.phone_number")
    private String phoneNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301343+09:00", comments="Source field: public.customer.post_code")
    private String postCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.300921+09:00", comments="Source field: public.customer.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301002+09:00", comments="Source field: public.customer.id")
    public void setId(String id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301082+09:00", comments="Source field: public.customer.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301116+09:00", comments="Source field: public.customer.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301175+09:00", comments="Source field: public.customer.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301207+09:00", comments="Source field: public.customer.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301282+09:00", comments="Source field: public.customer.phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301315+09:00", comments="Source field: public.customer.phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301373+09:00", comments="Source field: public.customer.post_code")
    public String getPostCode() {
        return postCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-11-07T00:19:08.301407+09:00", comments="Source field: public.customer.post_code")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}