package in.raghab.beans;

import in.raghab.service.requirements.IPayment;

public class DebitCard implements IPayment {

	public DebitCard() {
		super();
		System.out.println("DebitCard::Constructor");
	}
	@Override
	public boolean pay() {
		//DebitCard logic
		System.out.println("Payed with DebitCard..");
		return true;
	}
	
}
