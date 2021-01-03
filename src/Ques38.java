import java.util.*;
public class Ques38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the first matrix");
		int[][] m1=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				m1[i][j]=sc.nextInt();
		}
		System.out.println("Enter the elements of the second matrix");
		int[][] m2=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				m2[i][j]=sc.nextInt();
		}
		int[][] m3 = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				m3[i][j]=m2[i][j]+m1[i][j];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(m3[i][j]+"	");
			System.out.println();
		}
		sc.close();
	}
}
