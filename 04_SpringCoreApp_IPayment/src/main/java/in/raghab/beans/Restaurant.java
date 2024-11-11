package in.raghab.beans;

import in.raghab.service.requirements.IPayment;

//Target Class
public class Restaurant {
	private IPayment ipayment;
	
	//Constructor Injection
	public Restaurant(IPayment ipayment) {
		super();
		System.out.println("Restaurant::1-arg-Constructor");
		this.ipayment = ipayment;
	}
	
	//Setter Injection
	public void setIpayment(IPayment ipayment) {
		this.ipayment = ipayment;
	}
	public void bill() {
		System.out.println("Bill payment processing.. ");
		if(ipayment.pay()) {
			System.out.println("Payment Successful!!");
		}else {
			System.out.println("Payment process Failed!!Try Again..");
		}
	}
	
}
