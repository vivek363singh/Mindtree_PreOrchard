package com.mindtree.pre_joining;

import java.util.Scanner;

public class Q48 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int  max=1000,min=1,i=0;
	int rand=(int)(Math.random()*((max-min)+1))+min;
	while(true)
	{
		System.out.println("Enter a number");

		if(sc.hasNextInt()) {
			int n=sc.nextInt();
			sc.nextLine();
			if(n==rand)
				break;
			else if(n>rand)
				System.out.println("Too high");
			else
				System.out.println("Too low");
			i++;
		}
		else {
			sc.nextLine();
			System.out.println("Enter a valid integer");
		}
	}
	System.out.println("The number is "+rand+" and no. of guesses is"+i);
	sc.close();

}


}
