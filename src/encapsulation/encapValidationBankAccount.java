package encapsulation;
/*Concept: Protect data from invalid values.
  Problem:Create class BankAccount.
  Validation: Balance should never be negative.
*/

class encapValidationBankAccount {
	
	private double balance;

    public void setBalance(double balance) {

        if(balance >= 0) {

            this.balance = balance;
        }
        else {
            System.out.println("Invalid balance");
        }

}

     public double getBalance() {

       return balance;
}
    
}