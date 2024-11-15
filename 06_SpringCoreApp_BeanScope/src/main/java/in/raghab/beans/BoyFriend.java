package in.raghab.beans;

import in.raghab.strategyDP.IPartner;

//target class
public class BoyFriend {
	private IPartner girlFriend;

	public BoyFriend(IPartner girlFriend) {
		super();
		System.out.println("BoyFriend::1-Arg Constructor");
		this.girlFriend = girlFriend;
	}
	public void doYouMarryWithMe(boolean money,boolean love) {
		System.out.println("BF::Do You Marry With Me???😍😍\n");
		if(girlFriend.marry(money, love)) {
			System.out.println("\nBF::I am so blessed and happy person to get u in my life");
		}else {
			System.out.println("\nBF::Okk...Crying...Good Bye..we will not meet again!!😫😫");
		}
	}
	
}
