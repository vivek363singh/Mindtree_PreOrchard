package com.mindtree.pre_joining;

import java.util.Calendar;
import java.util.Scanner;

public class Q46 {

	static Customer123[] customer = new Customer123[100];
	static int i=0,c=0,n1=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true)
		{

			do {
				System.out.println("1. Add customer details\n2. Book a ticket\n3. Display Customers\n4. Exit");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
				}
			}while(c<=0 && c<4);


			switch(c)
			{
			case 1:
				Add();
				break;

			case 2:
				Book();
				break;

			case 3:				
				do {
					System.out.println("1. ID based		2. Name based		3. City based");
					if(sc.hasNextInt()) {

						n1=sc.nextInt();
						sc.nextLine();
					}
					else {
						sc.nextLine();
						System.out.println("Invalid input");
					}

				}while(n1<=0 && n1<4);

				switch(n1)
				{
				case 1:Display_Id();
				break;
				case 2:Display_Name();
				break;
				case 3:Display_city();
				break;
				}
				System.out.println();
				break;
			case 4:System.out.println("Thank you");
			System.exit(0);
			}
		}
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


	public static void Add() {

		String name="",address="",no="",dob=""; int id=0,age=0;
		customer[i] = new Customer123();
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("Enter name");
			if(sc.hasNext()) {
				name=sc.next();
			}
			if(!str_validation(name))
				System.out.println("Invalid name");
		}while(!str_validation(name));
		customer[i].setName(name);


		do{
			System.out.println("Enter id");
			if(sc.hasNextInt()) {
				id=sc.nextInt();	
			}
			else {
				System.out.println("enter valid id");
				sc.next();
			}
		}while(id<=0);
		customer[i].setId(id);

		do{
			System.out.println("Enter age");
			if(sc.hasNextInt()) {
				age=sc.nextInt();	
			}
			else {
				System.out.println("enter valid age");
				sc.next();
			}
		}while(age<=0);
		customer[i].setAge(age);


		do{
			System.out.println("Enter address");
			if(sc.hasNext()) {
				address=sc.next();
			}
			if(!str_validation(address))
				System.out.println("Invalid address");
		}while(!str_validation(address));
		customer[i].setAddress(address);


		do{
			System.out.println("Enter dob");
			if(sc.hasNext()) {
				dob=sc.next();
				if(!(dob_validation(dob)))
					System.out.println("Invalid dob");

			}
		}while(!(dob_validation(dob)));
		customer[i].setDob(dob);


		do{
			System.out.println("Enter 10 digit mobile no starting with 0");
			if(sc.hasNext()) {
				no=sc.next();
			}
			if((!no_validation(no)))
				System.out.println("Invalid no");
		}while(!(no_validation(no)));
		customer[i].setNo(no);

		i++;
	}

	static boolean no_validation(String no) {
		boolean flag=false;

		for(int i=0;i<no.length();i++)
			if(!(no.charAt(i)>='0' && no.charAt(i)<='9'))
				return flag;

		if(no.length()==11 && no.charAt(0)=='0') {
			flag=true;

		}

		return flag;
	}

	static boolean str_validation(String s) {
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z') && !(s.charAt(i)>='A'&&s.charAt(i)<='Z') && !(s.charAt(i)==' ')) 
				flag=false;
		}
		return flag;
	}

	public static void Display_Id() {

		int[] arr=new int[100];
		for(int j=0;j<i;j++)
			arr[j]=customer[j].getId();
		for(int j=0;j<i-1;j++)
		{
			for(int k=j+1;k<i-j-1;k++)
			{
				if(arr[k]>arr[k+1])
				{
					int a=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=a;
				}
			}
		}
		for(int j=0;j<i;j++)
		{
			for(int k=0;k<i;k++) 
			{
				if(arr[j]==customer[k].getId())
					System.out.println(customer[k]);
			}
		}
	}

	public static void Display_Name() {

		String [] arr=new String[100];
		for(int j=0;j<i;j++)
			arr[j]=customer[j].getName();
		for(int j=0;j<i-1;j++)
		{
			for(int k=0;k<i-j-1;k++)
			{
				if(arr[k].compareTo(arr[k+1])>0)
				{
					String a=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=a;
				}
			}
		}
		for(int j=0;j<i;j++)
		{
			for(int k=0;k<i;k++) 
			{
				if(arr[j].equals(customer[k].getName()))
					System.out.println(customer[k]);
			}
		}

	}

	public static void Display_city() {

		String [] arr=new String[100];
		for(int j=0;j<i;j++)
			arr[j]=customer[j].getAddress();
		for(int j=0;j<i-1;j++)
		{
			for(int k=0;k<i-j-1;k++)
			{
				if(arr[k].compareTo(arr[k+1])>0)
				{
					String a=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=a;
				}
			}
		}


		for(int j=0;j<i;j++)
		{
			for(int k=0;k<i;k++) 
			{
				if(arr[j].equals(customer[k].getAddress()))
					System.out.println(customer[k]);
			}
		}
	}

	static class Date1 
	{
		int day, month, year;

		public Date1(int day, int month, int year)
		{
			this.day= day;
			this.month = month;
			this.year =year;
		}

	};

	static int monthDays[] = {31, 28, 31, 30, 31, 30,
			31, 31, 30, 31, 30, 31};


	static int countLeapYears(Date1 d) 
	{
		int years = d.year;


		if (d.month <= 2) 
		{
			years--;
		}

		return years / 4 - years / 100 + years / 400;
	}


	static int getDifference(Date1 dt1, Date1 dt2)
	{

		int n1 = dt1.year * 365 + dt1.day;

		for (int i = 0; i < dt1.month - 1; i++) 
		{
			n1 += monthDays[i];
		}


		n1 += countLeapYears(dt1);


		int n2 = dt2.year * 365 + dt2.day;
		for (int i = 0; i < dt2.month - 1; i++)
		{
			n2 += monthDays[i];
		}
		n2 += countLeapYears(dt2);


		return (n2 - n1);
	}

	public static void Book() {
		Scanner sc = new Scanner(System.in);
		boolean flag1=false, flag2=false, flag3=false,flag4=false;

		System.out.println("Enter id");
		int id=sc.nextInt();
		sc.nextLine();
		for(int j=0;j<i;j++)
		{
			if(customer[j].getId()==id)
				flag1=true;
		}
		System.out.println("Enter name");
		String name=sc.next();

		for(int j=0;j<i;j++)
		{
			if(customer[j].getName().equals(name))
				flag2=true; 
		}

		System.out.println("Enter source & destination");
		String source=sc.next();
		String destination=sc.next();

		if(!source.equals(destination))
			flag3=true;

		System.out.println("Enter day,month and month for booking");
		int day1=sc.nextInt();
		int month1=sc.nextInt();
		int year1=sc.nextInt();

		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_MONTH);		
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);

		Date1 dt2 = new Date1(day1,month1,year1);
		Date1 dt1 = new Date1(day,month+1,year);

		if(getDifference(dt1,dt2)>0)
		{

			flag4=true;
			System.out.println(flag4);
		}

		System.out.println(flag1+" "+flag2+" "+flag3+" "+flag4);

		boolean flag=flag1&&flag2&&flag3&&flag4;

		if(flag)
			System.out.println("Ticket confirmed");
		else
			System.out.println("Failure");
	}

}

class Customer123{

	private String name,source,no,destination,address,dob; private int id,age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer Details    [name=" + name + ", 	address=" + address + ", 	dob=" + dob + ",	mobile no="+ no +", 	id=" + id + ", 	age=" + age + "]";
	}

}

