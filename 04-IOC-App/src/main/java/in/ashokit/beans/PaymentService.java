package in.ashokit.beans;

public class PaymentService {

	private IPayment payment;

	
	  public PaymentService() {
	  System.out.println("Payment Service Constructor");
	}
	  public PaymentService(IPayment payment) {
		  System.out.println("Payment Service Parameterized Constructor");
		  this.payment=payment;
		}

	public void doPayment(double billAmt) {
		boolean status = payment.Processpayment(billAmt);

		if (status == true) {
			System.out.println("Recipt Printing....");
		} else {
			System.out.println("Payment Declines....");
		}
	}

}
