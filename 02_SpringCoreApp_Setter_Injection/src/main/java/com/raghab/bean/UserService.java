package com.raghab.bean;

public class UserService {
	
	private PwdService pwdService;
	
	public UserService() {
		super();
		System.out.println("UserService::Constructor");
	}
	
	//Setter Injection

	public void setPwdService(PwdService pwdService) {
		System.out.println("SetPwdService() called by IOC container..");
		this.pwdService = pwdService;
	}


	public void saveUser(String name,String pwd,Long phoneNumber) {
		String encodePwd=pwdService.encodePwd(pwd);
		
		System.out.println("Encoded Password:: "+encodePwd);
		
		//TODO:: Database Integration and store the user data in the DB
		System.out.println("User Records Stored into DB Successfully");//Dummy Statement
	}
}
