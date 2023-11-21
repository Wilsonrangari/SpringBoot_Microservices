package in.ashokit.beans;

public class DebitCardPayment implements IPayment{

	public DebitCardPayment() {
		System.out.println("Debit Card Constrcutor");
	}

	public boolean Processpayment(double billAmt) {

		//some logic
		System.out.println("Debit Card Paymnet Successfull");
		return true;
	}

}
