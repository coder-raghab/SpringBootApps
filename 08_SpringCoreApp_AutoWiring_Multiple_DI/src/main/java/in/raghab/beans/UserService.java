package in.raghab.beans;

public class UserService {
	private IPwdService pwdService;
	private IUserDao userDao;
	private IEmailService emailService;
	public UserService(IPwdService pwdService, IUserDao userDao, IEmailService emailService) {
		System.out.println("UserService::3-Param Constructor");
		this.pwdService = pwdService;
		this.userDao = userDao;
		this.emailService = emailService;
	}
	public void userRegistration() {
		System.out.println("User Registration is Processing...");
		pwdService.generatePwd();
		userDao.saveUser();
		emailService.sendEmail();
	}
	
}
