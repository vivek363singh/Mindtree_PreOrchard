package com.mindtree.pre_joining;

import java.util.Scanner;

public class Q51 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t=0,n=0;
		
		do {
			System.out.println("enter the number ofelements");
			if(sc.hasNextInt()) {

				n=sc.nextInt();
				sc.nextLine();
			}
			else {
				sc.nextLine();
				System.out.println("Invalid input");
			}
		}while(n<0);
		
		
		int[] arr = new int[n];
		int[] duplicate = new int[n];
		int[] count= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			if(sc.hasNextInt()) {
				arr[i]=sc.nextInt();
				sc.nextLine();
			}
			else {
				sc.nextLine();
				System.out.println("Enter valid number");
			}
		}
		for(int i=0;i<n;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j] && count[j]==0)
				{
					count[j]=1;
					if(flag)
					{
						duplicate[t]=arr[i];
						t++;
						flag=false;
					}
				}
			}
		}
		if(t!=0)
			{
			System.out.println("Duplicate elements are");
			for(int i=0;i<t;i++)
				System.out.println(duplicate[i]);
			}
		else
			System.out.println("-1");
		sc.close();
	}
}
