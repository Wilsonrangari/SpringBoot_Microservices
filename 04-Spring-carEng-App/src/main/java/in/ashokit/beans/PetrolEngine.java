package in.ashokit.beans;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("PetrolEngine: Constructor");
	}

	public int start() {
		System.out.println("Petrol Engine has been started");
		return 1;
	}

}
