package com.mindtree.ApplicationSoftware;

import java.util.Scanner;

public class AppSoftware {

	static int i=0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag=true;

		Software[] software = new Software[100];

		int choice=0;

		while(flag) {


			while(choice<=0 && choice>4) {
				System.out.println("1.Add new software\n 2.Purchase software\n 3.Display details of entered id\n 4.Exit");

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

			case 1:Add(software); break;

			case 2:Purchase(software); break;

			case 3: DisplayId(software); break;

			case 4: flag=false; break;

			}

		}

	}

	static void Add(Software[] software) {

		Scanner sc = new Scanner(System.in);

		int id=0; float cost=0; String name="",licenseNumber=""; boolean flag=true;

		while(!str_validation(name)) {

			System.out.println("Enter name");
			if(sc.hasNext()) {
				name=sc.nextLine();
			}
			if(!str_validation(name))
				System.out.println("Invalid name");
		}

		while(flag) {
			System.out.println("Enter licenseNumber");

			if(sc.hasNext()) {
				licenseNumber=sc.nextLine();
				flag=false;
			}
		}

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

		while(cost<=0) {
			System.out.println("Enter cost");
			if(sc.hasNextFloat()) {
				cost=sc.nextFloat();
			}
			else {
				sc.next();
				System.out.println("Enter valid id");
			}
		}

		software[i]=new Software(id,cost,name,licenseNumber);
		i++;

	}

	static void Purchase(Software[] software) {

		Scanner sc =new Scanner(System.in);
		int id=0; float finalcost=0;
		float[] cost = new  float[i];

		for(int i=0;i<cost.length;i++)
			cost[i]=software[i].getCost();
		int n =cost.length;
		for (int i = 1; i < n; ++i) { 
			float key = cost[i]; 
			int j = i - 1; 

			while (j >= 0 && cost[j] > key) { 
				cost[j + 1] = cost[j]; 
				j = j - 1; 
			} 
			cost[j + 1] = key; 
		}

		for(int j=0;j<n;j++) 
		{
			for(int k=0;k<n;k++)
			{
				if(cost[j]==software[k].getCost())
					System.out.println(software[k]);			
			}			
		}

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

		for(int i=0;i<n;i++) {

			if(id==software[i].getId()) {

				finalcost=software[i].getCost()+(float)(software[i].getCost()*0.05);
				System.out.println(software[i] +"\n Billing Amount: "+ finalcost);
			}
		}





	}

	static void DisplayId(Software[] software) {
		Scanner sc = new Scanner(System.in);
		int id=0;
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
		int[] idarr = new int[i];
		for(int i=0;i<idarr.length;i++) {
			idarr[i]=software[i].getId();
		}

		if(bs(idarr,id)==-1) {
			System.out.println("Id not found");
		}
		else {
			

		}




	}

	static int bs(int[] idarr,int id) {

		int l = 0, r = idarr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			if (idarr[m] == id) 
				return m; 

			if (idarr[m] < id) 
				l = m + 1; 

			else
				r = m - 1; 
		}

		return -1;

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
