package in.raghab.beans;

public class UserDaoImpl implements IUserDao {

	public UserDaoImpl() {
		System.out.println("UserDaoImpl::Constructor");
	}
	@Override
	public void saveUser() {
		//Dao logic to save data in DB
		System.out.println("User Data Saved successfully in DB");
	}
	
}
