package in.ashokit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration

//@ComponentScan(basePackages = {"in.ashokit", "com.tcs"})

// to configure java classes as bean classes we need this class--->
@ComponentScan
//componenetscan will scan all the project and create object for the spring bean classes(it will look for @component) and it will scan the current package only
//or you if you wante to check the complete project use(basepackage and give packga ename there ) so it will search them inthose package
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: Constructor");
		
		
	}

}
