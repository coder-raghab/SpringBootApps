package in.raghab.beans;

import in.raghab.strategyDP.IPartner;

//dependent class 
public class GirlFriend implements IPartner{

	public GirlFriend() {
		super();
		System.out.println("GirlFriend::Constructor");
	}
	
	@Override
	public boolean marry(boolean money,boolean love) {
		if(money==true && love == true) {
			System.out.println("GF::Yes..Baby!!!");
			return true;
		}else {
			System.out.println("GF::No..my family will not support or I have another person in my life.."
					+ "don't warry u will get far better than me😊🥲🥲 but we are just Friend!!");
			return false;
		}
	}
	
}