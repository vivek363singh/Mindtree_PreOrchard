import java.util.*;
public class Ques35 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		int n=sc.nextInt();
		student12[] arrobj = new student12[n];
		for(int i=0;i<n;i++)
		{
			arrobj[i]=new student12();
			System.out.println("Enter");
			arrobj[i].setScore(sc.nextInt());;
		}
		student12 obj=highest_marks(arrobj);
		System.out.println(obj.score);
		sc.close();
	}

	static student12 highest_marks(student12[] arrobj1) {
		int n=arrobj1.length;
		int[] arr = new int[n];
		for(int i=0;i<4;i++)
		{

			arr[i]=arrobj1[i].score;
		}

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{	
				if(arr[j]>arr[j+1])
				{

					int a =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}


		int id=0;
		for(int i=0;i<n;i++)
		{
			if(arr[n-1]==arrobj1[i].score)
				id=i;
		}


		return arrobj1[id];

	}

}

class student12 {
	int id,score;
	String name,branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}


