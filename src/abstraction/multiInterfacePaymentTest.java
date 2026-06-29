package abstraction;

public class multiInterfacePaymentTest {
	
	public static void main(String[] arg) {
		
		multiInterfacePayment pm;
		pm = new multiInterfacePaymentCreditCard();
		pm.pay();
		pm = new multiInterfacePaymentPayPal();
		pm.pay();
		pm = new multiInterfacePaymentUPI();
		pm.pay();
		
	
	}
	

}
