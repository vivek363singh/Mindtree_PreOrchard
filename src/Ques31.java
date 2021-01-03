import java.util.Scanner;
public class Ques31 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of customers");
		int n=sc.nextInt();
		Customers[] cus = new Customers[n];
		for(int i=0;i<n;i++) {
			cus[i]= new Customers();
			System.out.println("Enter name");
			String name= sc.next();
			cus[i].SetName(name);
			System.out.println("Enter mobile no");
			String mobileno= sc.next();
			cus[i].Setmobileno(mobileno);
			System.out.println("Enter feebackrating");
			double f=sc.nextDouble();
			cus[i].setfeedbackrating(f);
		}
		
		for(int i=0;i<n;i++)
				System.out.println(cus[i]);
		sc.close();
	}

}

class Customers{
	
	String name;
	String mobileno;
	double feedbackrating;
	
	Customers(){
		
	}
	Customers(String name, String mobileno, double feedbackrating){
		this.name=name;
		this.feedbackrating=feedbackrating;
		this.mobileno=mobileno;
	}
	
	void SetName(String name) {
		this.name=name;
	}
	void Setmobileno(String mobileno) {
		this.mobileno=mobileno;
	}
	void setfeedbackrating(double feedbackrating) {
		this.feedbackrating=feedbackrating;
	}
	String getName(String name ) {
		return name;
	}
	String getmobileno(String mobileno) {
		return mobileno;
	}
	int getfeedbackrating(int feedbackrating) {
		return feedbackrating;
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", feedbackrating=" + feedbackrating + "]";
	}
	
	
	
}
