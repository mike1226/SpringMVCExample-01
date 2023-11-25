package com.example.servingwebcontent.utils;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CommonResult {

	private int status;
	
	private String Message;
	
	public CommonResult() {
		this.status = 0;
		this.Message = "";
	}
	
	
}
