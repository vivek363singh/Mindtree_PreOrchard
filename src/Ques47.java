import java.util.*;
public class Ques47 {

	static Customer1[] objarr = new Customer1[100];
	static int id=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			int n=0;
			do {
				try {
					System.out.println("1.Create user\t2.Update user\t3.Delete user\t4Display user\t5.Exit");;
					n=sc.nextInt();
				}
				catch(InputMismatchException e){
					System.out.println("Enter integer correct no of choice\n");
				}
				sc.nextLine();
			}while(n<=0 && n<6);

			switch(n) 
			{
			case 1:
				objarr[id] = new Customer1();
				create(objarr[id]);
				break;
			case 2:
				update();
				break;

			case 3:delete();
			id--;
			break;
			case 4:
				int c=0;
				do {
					try {
						System.out.println("1.Display based on name\t2.Display based on id\t3.display users with non-zero balance\t4.Display address of user in sorted oder\t5.Display based on id sorted");
						c=sc.nextInt();
					}
					catch(InputMismatchException e){
						System.out.println("Enter integer correct no of choice\n");
					}
					sc.nextLine();
				}while(c<=0 && c<6);

				switch(c)
				{
				case 1:
					display_name();
					break;
				case 2:
					display_id();
					break;
				case 3:
					display_nz_balance();
					break;
				case 4:
					display_sorted_address();
					break;
				case 5:
					display_sorted_ac_id();
					break;
				}
				break;

			case 5:
				System.out.println("Thank you");
				flag=false;
			}
		}
	}

	static void create(Customer1 objarr)
	{
		Scanner sc = new Scanner(System.in);
		String name="",address="",account_type="",dob=""; int account_number=0; double account_balance=0;

		//Name Validation
		do{
			System.out.println("Enter name");
			if(sc.hasNext()) {
				name=sc.next();
			}
			sc.nextLine();
			if(!str_validation(name))
				System.out.println("Invalid name");
		}while(!str_validation(name));
		objarr.setName(name);

		//Address Validation
		do{
			System.out.println("Enter address");
			if(sc.hasNext()) {
				address=sc.next();
			}
			sc.nextLine();
			if(!str_validation(address))
				System.out.println("Invalid address");
		}while(!str_validation(address));
		objarr.setAddress(address);

		//Account_number Validation
		do{
			System.out.println("Enter account_number");
			if(sc.hasNextInt()) {
				account_number=sc.nextInt();	
			}
			else {
				System.out.println("enter valid account_number");
				sc.next();
			}
		}while(account_number<=0);
		objarr.setAccount_number(account_number);

		//DOB Validation
		do{
			System.out.println("Enter dob in DD/MM/YYYY format");
			if(sc.hasNext()) {
				dob=sc.next();
				if(!(dob_validation(dob)))
					System.out.println("Invalid dob");

			}
		}while(!(dob_validation(dob)));
		objarr.setDob(dob);


		//Balance Validation
		do{
			System.out.println("Enter balance");
			if(sc.hasNextDouble()) {
				account_balance=sc.nextDouble();	
			}
			else {
				System.out.println("enter valid balance");
				sc.next();
			}
		}while(account_balance<=0);
		objarr.setBalance(account_balance);


		//Account_type Validation
		do{
			System.out.println("Enter account_type");
			if(sc.hasNext()) {
				account_type=sc.next();
				if(!str_validation(account_type))
					System.out.println("Invalid account_type");
			}
		}while(!str_validation(account_type));
		objarr.setAccount_type(account_type);

		id++;

	}

	static boolean dob_validation(String dob) {
		boolean condition=isInteger(dob.charAt(0)) && isInteger(dob.charAt(1))  && isInteger(dob.charAt(3))  &&isInteger(dob.charAt(4)) && isInteger(dob.charAt(6))  && isInteger(dob.charAt(7)) && isInteger(dob.charAt(7)) && isInteger(dob.charAt(8)) && isInteger(dob.charAt(9));
		if(condition){
			if(dob.length()==10 && dob.charAt(2)=='/' && dob.charAt(5)=='/') {
				return true;
			}
		}
		return false;

	}


	static boolean isInteger(char c) {

		if(c>='0' && c<='9')
			return true;
		return false;

	}


	static boolean str_validation(String s) {
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z') && !(s.charAt(i)>='A'&&s.charAt(i)<='Z') && !(s.charAt(i)==' ')) 
				flag=false;
		}
		return flag;
	}

	static void update() {
		int n=0,account_number=0; String address_updated="",name_updated="";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Address\t2.Name");
			if(sc.hasNextInt())
				n=sc.nextInt();
			else {
				System.out.println("Invalid integer input");
				sc.next();
			}
		}while(!(n==1 || n==2));

		if(n==1)
		{	


			do {
				System.out.println("enter account no whose address needed to be updated");
				if(sc.hasNextInt()) {
					account_number=sc.nextInt();
				}
				else {
					System.out.println("Ente valid account no");
					sc.next();
				}
			}while(n<=0);

			for(int j=0;j<id;j++)
			{
				if(objarr[j].getAccount_number()==account_number)
				{
					do {
						System.out.println("Address to be updated to the account");
						if(sc.hasNext()) {
							address_updated=sc.next();
							if(!(str_validation(address_updated)))
								System.out.println("Invalid address input");
						}
					}while(!str_validation(address_updated));

					address_updated=sc.next();
					objarr[j].setAddress(address_updated);
					System.out.println("Updated successfully to"+address_updated);
				}
			
			}
		}
		else
		{
			do {
				System.out.println("enter account no whose address needed to be updated");
				if(sc.hasNextInt()) {
					account_number=sc.nextInt();
				}
				else {
					System.out.println("Ente valid account no");
					sc.next();
				}
			}while(n<=0);

			for(int j=0;j<id;j++)
			{
				if(objarr[j].getAccount_number()==account_number)
				{
					do {
						System.out.println("Address to be updated to the account");
						if(sc.hasNext()) {
							name_updated=sc.next();
							if(!(str_validation(name_updated)))
								System.out.println("Invalid name input");
						}
					}while(!str_validation(name_updated));

					objarr[j].setName(name_updated);
					System.out.println("Updated successfully to"+name_updated);
				}
			}
		}
	}

	static void delete()
	{	
		Scanner sc = new Scanner(System.in);
		boolean flag=false;
		int k=0,account_number=0;
		do {
			System.out.println("enter account no which is needed to be deleted");
			if(sc.hasNextInt()) {
				account_number=sc.nextInt();
			}
			else {
				System.out.println("Ente valid account no");
				sc.next();
			}
		}while(account_number<=0);
		
		for(int i=0;i<id;i++) 
		{
			if(objarr[i].getAccount_number()==account_number) 
			{
				flag=true;
				k=i;
			}
			else {
				System.out.println("Wrong account no");
			}

		}
		if(flag) 
		{

			for(int j=k;j<id;j++)
				objarr[j]=objarr[j+1];
			System.out.println("Successfully deleted\n");
			
		}
		
	}

	static void display_id()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int n=sc.nextInt();
		System.out.println(objarr[n]);

	}

	static void display_nz_balance()
	{
		System.out.println("Based on NZ balance");
		for(int i=0;i<id;i++)
			if(objarr[i].getBalance()>0)
				System.out.println(objarr[i]);
	}

	static void display_name()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String s=sc.next();
		for(int i=0;i<id;i++)
		{

			if(objarr[i].getName().equalsIgnoreCase(s))
				System.out.println(objarr[i]);
		}
	}

	static void display_sorted_address()
	{
		String[] arr= new String[id];
		for(int j=0;j<id;j++)
			arr[j]=objarr[j].getAddress();
		for(int j=0;j<id-1;j++)
		{
			for(int k=0;k<id-j-1;k++)
			{
				if(arr[k].compareTo(arr[k+1])>0)
				{
					String a=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=a;
				}
			}
		}
		for(int j=0;j<arr.length;j++) 
		{
			for(int k=0;k<id;k++)
			{
				if(arr[j].equalsIgnoreCase(objarr[k].getAddress()))
					System.out.println(objarr[k]);			
			}			
		}
	}	

	static void display_sorted_ac_id()
	{
		int[] arr = new int[id];
		for(int i=0;i<id;i++)
			arr[i]=objarr[i].getAccount_number();
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
		{   for (int j = 0; j < n-i-1; j++) 
			if (arr[j] > arr[j+1]) 
			{ 
				int temp = arr[j]; 
				arr[j] = arr[j+1]; 
				arr[j+1] = temp; 
			}
		}
		for(int j=0;j<arr.length;j++) 
		{
			for(int k=0;k<id;k++)
			{
				if(arr[j]==objarr[k].getAccount_number())
					System.out.println(objarr[k]);			
			}			
		}		
	}
}

class Customer1{

	private String name, account_type,address,dob; private int  account_number; private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer1 [name=" + name + ", account_type=" + account_type + ", address=" + address + ", dob=" + dob
				+ ", account_number=" + account_number + ", balance=" + balance + "]\n";
	}


}
