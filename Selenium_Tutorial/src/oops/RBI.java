package oops;

public interface RBI {

	abstract void minDeposit();
	abstract void minWithDrawl();
	abstract void Loans();
	abstract void AccountTypes();
	abstract void creditCard();
	abstract void ATM();
	abstract void AML();
	abstract void KYC();
	
	static void demat() {
		System.out.println("Demat account facility is available..!");
	}

	default void maxDeposit() {
		System.out.println("Maximum deposit for a given day is 5 lakhs..!");
	}
	
	public static void main(String[] args) {
		demat();
	}







}
