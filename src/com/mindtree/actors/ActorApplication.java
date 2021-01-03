package com.mindtree.actors;

import java.util.*;

public class ActorApplication {

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
		Actor[] actor = new Actor[n];
		int choice =0;
		
		while(flag1) {
			
			while(choice<=0 && choice>5) {
				System.out.println("1.Add actor details\n 2.Display male actors\n 3.Display all actor in ascending order of age\n 4.Displa all actor with movie count more than 10\n 5.Exit");
				
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
			case 1:Add(actor); break;
			
			case 2:DisplayMale(actor); break;
			
			case 3:DisplayAscend(actor); break;
			
			case 4: DisplayCount(actor); break;
			
			case 5: flag1=false;
			 
			}
		}
	}
	
	static void Add(Actor[] actor) {
		
		Scanner sc = new Scanner(System.in);
		int age=0,count=-1,id=0;
		String name="",gender="";
		actor[i] = new Actor();
		
		while(!str_validation(name)) {
			
			System.out.println("Enter name");
			if(sc.hasNext()) {
				name=sc.nextLine();
			}
			if(!str_validation(name))
				System.out.println("Invalid name");
		}
		actor[i].setName(name);
		
		
		while(age<=0) {
			System.out.println("Enter age");
			if(sc.hasNextInt()) {
				age=sc.nextInt();
			}
			else {
				sc.next();
				System.out.println("Enter valid age");
			}
		}
		actor[i].setAge(age);
		
		while(id<=0) {
			System.out.println("Enter id");
			if(sc.hasNextInt()) {
				id=sc.nextInt();
			}
			else {
				sc.next();
				System.out.println("Enter valid id");
			}
		}
		actor[i].setActorId(id);
		
		while(count<0) {
			System.out.println("Enter movie count");
			if(sc.hasNextInt()) {
				count=sc.nextInt();
			}
			else {
				sc.next();
				System.out.println("Enter valid movie count");
			}
		}
		actor[i].setMovieCount(count);
		
		i++;
		
	}
	
	static boolean str_validation(String s) {
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)>='a'&&s.charAt(i)<='z') && !(s.charAt(i)>='A'&&s.charAt(i)<='Z') && !(s.charAt(i)==' ')) 
				flag=false;
		}
		return flag;
	}
	
	static void DisplayMale(Actor[] actor) {
		
		for(int j=0;j<i;j++) {
			if(actor[j].getGender().equalsIgnoreCase("male")) {
				System.out.println(actor[j]);
			}
		}
		
	}
	
	static void DisplayCount(Actor[] actor) {
		
		for(int i=0;i<actor.length;i++) {
			if(actor[i].getMovieCount()>10)
				System.out.println(actor[i]);
		}
		
	}
	
	static void DisplayAscend(Actor[] actor) {
		
		int n= actor.length;
		int[] age = new int[n];
		
		for(int i=0;i<actor.length;i++)
			age[i]=actor[i].getAge();
		
		for (int i = 0; i < n-1; i++) 
		{   for (int j = 0; j < n-i-1; j++) 
			if (age[j] > age[j+1]) 
			{ 
				int temp = age[j]; 
				age[j] = age[j+1]; 
				age[j+1] = temp; 
			}
		}
		
		for(int j=0;j<age.length;j++) 
		{
			for(int k=0;k<age.length;k++)
			{
				if(age[j]==actor[i].getAge())
					System.out.println(actor[k]);			
			}			
		}	
		
	}

}

