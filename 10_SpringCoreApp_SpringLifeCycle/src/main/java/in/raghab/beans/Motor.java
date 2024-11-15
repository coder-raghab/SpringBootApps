package in.raghab.beans;

public class Motor {

	public Motor() {
		System.out.println("Motor::Constructor");
	}
	
	//init()
	public void start() {
		System.out.println("Motor Started...");
	}
	
	//service()
	public void work() {
		System.out.println("Motor is working...");
	}
	
	//destroy()
	public void stop() {
		System.out.println("Motor stopped...");
	}
	
}
