package com.mindtree.actor;

import java.util.Scanner;

public class ActorApp {

	static int no_actor,i=0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean no_flag=true,main_flag= true;
		int choice=0;
		while(no_flag) {
			System.out.println("Enter  number of actor");
			if(sc.hasNextInt()) {
				no_actor=sc.nextInt();
				sc.nextLine();
				no_flag=false;
				System.out.println("Thank you");
			}
			else {
				sc.next();
				System.out.println("Enter a valid integer");
			}
		}

		Actor[] actor = new Actor[no_actor];

		while(main_flag) {

			while(!(choice>=1 && choice<=3)) {

				System.out.println("1. Enter actor details to add\n 2. Display all male actor\n 3. Display all actor in ascending order of age\n 4. Display actor with number of movies more than 10");
				if(sc.hasNextInt()) {
					choice=sc.nextInt();
					sc.nextLine();
				}
				else {
					System.out.println("Enter a valid choice\n");
					sc.nextLine();
				}
			}
		}

		switch(choice) {

		case 1:Add_Actor(actor);
		}

	}

	static void Add_Actor(Actor[] actor) {

		String name="",gender="";
		int id=0,count=0,age=0;
		actor[i]= new Actor();
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("Enter name");
			if(sc.hasNext()) {
				name=sc.next();
			}
			if(!str_validation(name))
				System.out.println("Invalid name");
		}while(!str_validation(name));

		actor[i].setActor_name(name);


		while(age<=0){
			System.out.println("Enter age");
			if(sc.hasNextInt()) {
				age=sc.nextInt();	
			}
			else {
				System.out.println("enter valid age");
				sc.next();
			}
		}
		
		actor[i].setAge(age);
		
		

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

class Actor {

	int actor_id,movie_count,age;
	String actor_name,gender;
	public Actor() {
		
	}
	public Actor(int actor_id, int movie_count, int age, String actor_name, String gender) {
		super();
		this.actor_id = actor_id;
		this.movie_count = movie_count;
		this.age = age;
		this.actor_name = actor_name;
		this.gender = gender;
	}
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public int getMovie_count() {
		return movie_count;
	}
	public void setMovie_count(int movie_count) {
		this.movie_count = movie_count;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getActor_name() {
		return actor_name;
	}
	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
