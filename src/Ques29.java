public class Ques29 {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1001,"vivek","Tollygunge,700053");
		Customer customer2 = new Customer(1002,"Rahul");
		Customer customer3 = new Customer(1003,"Rohit","Merut,700054","SB",5000.25);
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		
	}
	
	}

class Customer {

	int custId;
	String custName,custAddress,accType;
	double custBalance;
	Customer(){
		custId=0;
		custName="";custAddress="";accType="";	
	}
	
	Customer(int custId,String custName,String custAddress){
		this.custId=custId;
		this.custAddress=custAddress;
		this.custName=custName;
	}
	
	Customer(int custId,String custName){
		this.custId=custId;
		this.custName=custName;
	}
	
	Customer(int custId,String custName,String custAddress,String accType,double custBalance){
		this.custId=custId;
		this.custAddress=custAddress;
		this.custName=custName;
		this.accType=accType;
		this.custBalance=custBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", accType="
				+ accType + ", custBalance=" + custBalance + "]";
	}
	
}
	
	

