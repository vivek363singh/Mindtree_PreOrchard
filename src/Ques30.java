
public class Ques30 {

	public static void main(String[] args) {
		
		
	}

}

class SavingsAccount{
	
	int interest,accountNo;
	double balance;
	
	SavingsAccount(){
		
	}
	
	SavingsAccount(double balance,int interest,int accountNo){
		this.balance=balance;
		this.interest=interest;
		this.accountNo=accountNo;
	}
	
	void withDraw(double amount) {
		
		if(amount>balance)
			System.out.println("Low balance");
		else
			System.out.println("Withdrwan amount"+amount);
	}
	
	void calculateInterest() {
		
		double interest_amount=balance*interest*1;
		System.out.println("Interest earned"+interest_amount);
	}
	
}
