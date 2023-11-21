package in.ashokit.beans;

public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine: Constructor");
	}

	public int start() {
		System.out.println("Diesel Engine Start");
		return 1;
	}

}
