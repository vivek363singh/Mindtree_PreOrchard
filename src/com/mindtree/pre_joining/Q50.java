package com.mindtree.pre_joining;

import java.util.Scanner;

public class Q50 {


	public static void main(String[] args) 
	{

		do
		{

			Scanner sc = new Scanner(System.in);
			int choice=0;


			do {
				System.out. println("1. Check pallindrome numbers\n2. Check pallindrome string\n3. Exit" );
				if(sc.hasNextInt()) {

					choice=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Enter valid String");
				}

			}while(choice<0 && choice>4);


			switch(choice)
			{
			case 1:
				num_palli();
				break;
			case 2:
				str_palli();
				break;
			case 3:
				System.out.println("Thank you");
				System.exit(0);

			}
		}while(true);
	}

	static void num_palli()
	{
		Scanner sc1 = new Scanner(System.in);

		int num =0;
		do {
			System.out.println("Enter number");
			if(sc1.hasNextInt()) {
				num=sc1.nextInt();
				sc1.nextLine();
			}
			else {
				System.out.println("Ente valid number");
				sc1.next();
			}
		}while(num<0);
		int n=num;
		int rev=0,rem;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
		if(rev==n)
			System.out.println("Pallindrome number");
		else
			System.out.println("Not pallindrome");


	}
	static void str_palli()
	{
		Scanner sc = new Scanner(System.in);
		String s="";
		do{
			System.out.println("Enter string");
			if(sc.hasNext()) {
				s=sc.next();
				if(!v_s(s))
				{
					sc.nextLine();
					System.out.println("Invalid string");
				}
			}

		}while(!v_s(s));

		boolean flag=true;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				flag=false;
		if(flag)
			System.out.println("Pallindrome string");
		else
			System.out.println("Not a pallindrome string");

	}


	static boolean v_s(String s) {
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z') && !(s.charAt(i)>=67 &&s.charAt(i)<='Z') && !(s.charAt(i)==' ')) 
				flag=false;
		}
		return flag;
	}

}
