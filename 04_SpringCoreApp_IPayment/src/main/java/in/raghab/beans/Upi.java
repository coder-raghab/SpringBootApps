package in.raghab.beans;

import in.raghab.service.requirements.IPayment;

public class Upi implements IPayment {

	public Upi() {
		super();
		System.out.println("Upi::Constructor");
	}
	@Override
	public boolean pay() {
		//UPI Payment logic
		System.out.println("Payed with UPI..");
		return true;
	}
	
}
