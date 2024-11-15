package in.raghab.beans;

public class EmailServiceImpl implements IEmailService{

	public EmailServiceImpl() {
		System.out.println("EmailServiceImpl::Constructor");
	}
	@Override
	public void sendEmail() {
		//logic
		System.out.println("Email sent successfully");
	}
	
}
