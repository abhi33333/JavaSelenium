package encapsulation;

public class encapValidationBankAccountTest {
	
	public static void main(String[] args) {
		
		encapValidationBankAccount acc = new encapValidationBankAccount();
		    acc.setBalance(5000);
	        System.out.println(acc.getBalance());
		    acc.setBalance(-2000);

	}

}
