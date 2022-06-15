package com.example.demo.domain;

import javax.validation.constraints.NotBlank;

public class User {
	
	@NotBlank(message="ユーザーIDを記入してください。")
	private Long userid;
	
	@NotBlank(message="パスワードを記入してください。")	
	private String password;
	
	public Long getuserId() {
		return userid;
	}
	
	public void setuserId(Long userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
