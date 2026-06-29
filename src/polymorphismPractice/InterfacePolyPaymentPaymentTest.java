package polymorphismPractice;

public class InterfacePolyPaymentPaymentTest {
	
	 public static void main(String[] args) {

		 InterfacePolyPayment payment;

	        payment = new InterfacePolyPaymentCreditCardPayment();
	        payment.pay();

	        payment = new InterfacePolyPaymentPayPalPayment();
	        payment.pay();

	        payment = new InterfacePolyPaymentUPIPayment();
	        payment.pay();
	    }

}
