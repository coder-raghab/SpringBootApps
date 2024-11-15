package com.raghab.bean;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService() {
		super();
		System.out.println("PwdService::Constructor");
	}
	public String encodePwd(String pwd) {
		Encoder encoder=Base64.getEncoder();
		
		String encodedPwd=encoder.encodeToString(pwd.getBytes());
		
		return encodedPwd;
		
	}
	
}
