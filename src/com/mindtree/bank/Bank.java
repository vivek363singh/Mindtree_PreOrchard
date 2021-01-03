package com.mindtree.bank;

import java.util.Scanner;



public class Bank {
	
	static int i=0;

	public static void main(String[] args) {

		int n=0;
		boolean flag=true,flag1=true;

		Scanner sc = new Scanner(System.in);

		while(flag) {
			System.out.println("Enter no of actors");
			if(sc.hasNextInt()) {
				n=sc.nextInt();
				sc.nextLine();
				flag=false;
			}
			else {
				System.out.println("Enter a valid integer");
			}

		}

		Account[] account = new Account[n];
		int choice =0;

		while(flag1) {

			while(choice<=0 && choice>5) {
				System.out.println("1.Add new account\n 2.Display balance of entered account\n 3.Display all details of entered account holder name\n 4.Display all account in particular city\n 5.Display accounts in sorted order of balance\n 6.Exit");

				if(sc.hasNextInt()) {
					choice=sc.nextInt();
					sc.next();
				}

				else {
					sc.next();
					System.out.println("Enter a valid choice");
				}	
			}

			switch(choice) {
			
			case 1: Add(account); break;
			
			case 2: DisplayBalance(account); break;
			
			case 3: DisplayDetails(account); break;
			
			case 4: DisplayAccCity(account); break;
			
			case 5: DisplayBalanceSorted(account); break;
			
			case 6: flag1=false;
			}

		}

	}

	static void Add(Account[] account) {
		Scanner sc = new Scanner(System.in);
		int no=0; float balance=0;
		String name="",type="",city="";
		

		while(!str_validation(name)) {

			System.out.println("Enter name");
			if(sc.hasNext()) {
				name=sc.nextLine();
			}
			if(!str_validation(name))
				System.out.println("Invalid name");
		}
		
		while(!str_validation(type)) {

			System.out.println("Enter account type");
			if(sc.hasNext()) {
				type=sc.nextLine();
			}
			if(!str_validation(type))
				System.out.println("Invalid type");
		}
		
		while(!str_validation(city)) {

			System.out.println("Enter city name");
			if(sc.hasNext()) {
				city=sc.nextLine();
			}
			if(!str_validation(city))
				System.out.println("Invalid city name");
		}
		
		while(no<=0) {
			System.out.println("Enter account no");
			if(sc.hasNextInt()) {
				no=sc.nextInt();
			}
			else {
				sc.next();
				System.out.println("Enter valid account no");
			}
		}
		
		while(balance<=0) {
			System.out.println("Enter balance");
			if(sc.hasNextInt()) {
				balance=sc.nextFloat();
			}
			else {
				sc.next();
				System.out.println("Enter valid balance");
			}
		}
		
		account[i]=new Account(no,balance,name,type,city);
		i++;
	}
	
	static void DisplayBalance(Account[] account) {
		Scanner sc = new Scanner(System.in);
		int no=0;
		
		while(no<=0) {
			System.out.println("Enter account no");
			if(sc.hasNextInt()) {
				no=sc.nextInt();
			}
			else {
				sc.next();
				System.out.println("Enter valid account no");
			}
		}
		
		for(int j=0;j<i;j++) {
			if(account[i].getAccNo()==no) {
				System.out.println("Balance : "+ account[i].getAccBalance());
			}
		}
		
	}
	
	static void DisplayDetails(Account[] account) {
		Scanner sc = new Scanner(System.in);
		int no=0;
		
		while(no<=0) {
			System.out.println("Enter account no");
			if(sc.hasNextInt()) {
				no=sc.nextInt();
			}
			else {
				sc.next();
				System.out.println("Enter valid account no");
			}
		}
		
		for(int j=0;j<i;j++) {
			if(account[i].getAccNo()==no) {
				System.out.println( account[i]);
			}
		}
		
	}
	
	static void DisplayAccCity(Account[] account) {
		 Scanner sc = new Scanner(System.in);
		 
		 String city="";
		 
		 while(!str_validation(city)) {

				System.out.println("Enter city name");
				if(sc.hasNext()) {
					city=sc.nextLine();
				}
				if(!str_validation(city))
					System.out.println("Invalid city name");
			}
		 
		 for(int j=0;j<i;j++)
			 if(account[j].getCity().equalsIgnoreCase(city))				 
				 System.out.println(account[j]);
			 
		 
		 
	}
	
	static void DisplayBalanceSorted(Account[] account) {
		
		float[] balance = new float[i];
		
		for(int i=0;i<balance.length;i++)
			balance[i]=account[i].getAccBalance();
		
		for (int i = 0; i < balance.length-1; i++) 
		{   for (int j = 0; j < balance.length-i-1; j++) 
			if (balance[j] > balance[j+1]) 
			{ 
				float temp = balance[j]; 
				balance[j] = balance[j+1]; 
				balance[j+1] = temp; 
			}
		}
		
		for(int j=0;j<balance.length;j++) 
		{
			for(int k=0;k<balance.length;k++)
			{
				if(balance[j]==account[k].getAccBalance())
					System.out.println(account[k]);			
			}			
		}
		
	}
	
	static boolean str_validation(String s) {
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z') && !(s.charAt(i)>='A'&&s.charAt(i)<='Z') && !(s.charAt(i)==' ')) 
				flag=false;
		}
		return flag;
	}
	
}
