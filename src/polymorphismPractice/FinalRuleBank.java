package polymorphismPractice;

/*Final Method Rule: final methods cannot be overridden.
1. Create class Bank.
   Write: final void interestRate()
2. Try to override it in child class SavingsAccount.
    Observe the error.
 */

class FinalRuleBank {
	final void interestRate() {
		
	        System.out.println("Bank interest rate is fixed");
		
	}

}
