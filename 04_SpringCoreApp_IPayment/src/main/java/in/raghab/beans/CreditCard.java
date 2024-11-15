package in.raghab.beans;

import in.raghab.service.requirements.IPayment;

public class CreditCard implements IPayment {

	public CreditCard() {
		super();
		System.out.println("CreditCard::Constructor");
	}
	@Override
	public boolean pay() {
		//CreditCard Logics
		System.out.println("Payed with CreditCard..");
		return true;
	}
	
}
