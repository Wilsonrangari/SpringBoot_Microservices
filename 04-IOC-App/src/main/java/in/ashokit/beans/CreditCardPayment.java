package in.ashokit.beans;

public class CreditCardPayment implements IPayment{
	
	public CreditCardPayment() {
		System.out.println("Credit Card Constrcutor");
	}

	public boolean Processpayment(double billAmt) {

		//some logic
		System.out.println("Credit Card Paymnet Successfull");
		return true;
	}

}



