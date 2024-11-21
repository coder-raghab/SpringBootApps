package in.raghab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	

	public Application() {
		System.out.println("Application::Constructor");
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=
				SpringApplication.run(Application.class, args);
		
		System.out.println("\n\nApplicationContext Interface implemented class name:: "+ctxt.getClass().getName());
		
		System.out.println("\nSpring Bean objs are created by IOC is:: "+ctxt.getBeanDefinitionCount());
	}

}
