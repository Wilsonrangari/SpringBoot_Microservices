package in.ashokit.beans;

public class Car {
	
	private IEngine eng;
	
	public Car() {
			System.out.println("Car:: 0-param Constrctuor");
	}
	public Car(IEngine eng) {
		System.out.println("Car:: param-Constrctuor");
		this.eng=eng;
}
	/*
	 * public void setEng(IEngine eng) { this.eng=eng; }
	 */
	
	public void drive() {
		int status = eng.start();
		
		if(status>=1) {
			System.out.println("Car is driving");
		}
		else {
			System.out.println("Engine trouble");
		}
		
	}

}
