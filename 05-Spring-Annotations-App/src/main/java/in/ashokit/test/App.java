package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.AppConfig;
import in.ashokit.beans.Chip;
import in.ashokit.beans.Robot;

public class App {

	public static void main(String[] args) {
		
	ApplicationContext context=	new AnnotationConfigApplicationContext(AppConfig.class);
	
		 Robot bean = context.getBean(Robot.class);
		 bean.doWork();

	}

}
