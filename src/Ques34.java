import java.util.*;
public class Ques34 
{

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int n=0;

		do {
			try {
				System.out.println("Enter number of students");
				n=sc.nextInt();

			}
			catch(InputMismatchException e){
				System.out.println("Enter integer value for  no of students\n");
			}
			sc.nextLine();
		}while(n<=0);

		student1[] objarr =new student1[n];
		int i=0;

		while(true)
		{

			int c=0;
			do {
				try {
					System.out.println("1./ Enter student record,2./Display Student Names in sorted order based on branch,3./Display Student ID in ascending sorted order");
					c=sc.nextInt();

				}
				catch(InputMismatchException e){
					System.out.println("Enter integer correct no of choice\n");
				}
				sc.nextLine();
			}while(c<=0 && c<4);
			switch(c) 
			{
			case 1:
				objarr[i]= new student1();
				add(objarr[i]);
				i++;
				break;
			case 2:
				sort_name(objarr,i);
				break;
			case 3:
				sort_id(objarr,i);
				break;
			}
		}	
	}

	static void add(student1 obj) {
		Scanner sc = new Scanner(System.in);
		String name = new String();
		String branch = new String();
		try {
			System.out.println("enter name");
			name=sc.next();
		}
		catch(InputMismatchException e){
		}
		obj.setname(name);
		try {
			System.out.println("enter branch");
			branch = sc.next();
		} catch (InputMismatchException e) {

		}
		obj.setBranch(branch);
		int StudentId=0;
		try {
			System.out.println("enter StudentId");
			StudentId = sc.nextInt();
		} catch (InputMismatchException e) {

		}
		obj.setStudentId(StudentId);


	}

	static void sort_name(student1[] objarr,int k) {

		int l=k;

		String[] arr = new String[k];
		for(int i=0;i<k;i++)
			arr[i]=objarr[i].branch;

		//deleting duplicate elements
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{

				if(arr[i].compareToIgnoreCase(arr[j])==0)
				{
					for(int a=j;a<k-1;a++)
					{
						arr[a]=arr[a+1];
					}
					k--;
					j--;
				}
			}
		}

		String temp;
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(arr[j].compareTo(arr[i])<0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for(int i=0;i<k;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(arr[i].compareToIgnoreCase(objarr[j].branch)==0)
				{
					System.out.println(objarr[j].branch);

				}
			}	
		}

	}

	static void sort_id(student1[] objarr,int k) 
	{
		int[] arr=new int[k];
		for(int i=0;i<k;i++)
			System.out.println(arr[i]);
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<k;i++)
			System.out.println(arr[i]);
	}
}


class student1{

	int studentId; 
	String name, branch;


	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getname() {
		return name;
	}



	public void setname(String name) {
		this.name = name;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	@Override
	public String toString() {
		return "student1 [studentId=" + studentId + ", name=" + name + ", branch=" + branch + "]";
	}



}





