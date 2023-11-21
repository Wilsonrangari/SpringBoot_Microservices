package in.ashokit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//if i say my class is @Scope("prototype") then object will not be created for this as by default singleone will be invoked only
@Scope("prototype")
public class Car {
	
	public Car() {
		System.out.println("Car:: Constructor");
	}

}
