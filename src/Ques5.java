import java.util.*;
public class Ques5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		double [] arr1= new double[n1];
		double [] arr2= new double[n2];
		for(int i=0;i<n1;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
			arr2[i]=sc.nextInt();
		if(n1>n2)
		{
			double arr3[]= new double[n1];
			for(int i=0;i<n2;i++)
				arr3[i]=arr1[i]+arr2[i];
			for(int i=n2;i<n1;i++)
				arr3[i]=arr1[i];
			for(int i=0;i<arr3.length;i++)
				System.out.println(arr3[i]);
		}
		else
		{
			double arr3[]= new double[n2];
			for(int i=0;i<n1;i++)
				arr3[i]=arr1[i]+arr2[i];
			for(int i=n1;i<n2;i++)
				arr3[i]=arr2[i];
			for(int i=0;i<arr3.length;i++)
				System.out.println(arr3[i]);		
		}
		sc.close();
	}

}
