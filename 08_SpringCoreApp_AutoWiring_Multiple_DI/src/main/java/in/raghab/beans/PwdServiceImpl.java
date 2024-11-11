package in.raghab.beans;

public class PwdServiceImpl implements IPwdService {

	public PwdServiceImpl() {
		System.out.println("PwdServiceImpl::Constructor");
	}
	
	@Override
	public String generatePwd() {
		//logic for random pwd generate
		System.out.println("A new Random password generated");
		return "abc@123";
	}
	
}
