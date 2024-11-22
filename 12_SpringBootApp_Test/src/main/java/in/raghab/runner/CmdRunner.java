package in.raghab.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner{

	public CmdRunner() {
		System.out.println("CmdRunner:: Constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		/*here we can write the logics which will be executed only one time when 
		the application will start first time
		*/
		
		System.out.println("CommandLineRunner-> run() method implemented by Raghab");
		
	}
	
	
	
}
