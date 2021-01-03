import java.util.*;
public class Ques39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the matix");
		int[][] m1=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				m1[i][j]=sc.nextInt();
		}
		if(isRowMagic(m1))
			System.out.println("Magic row array");
		else
			System.out.println("Not a magic row array");
		sc.close();
	}
		public static boolean isRowMagic(int[][] m1)
		{
		int sum=0;
		int n=m1.length;
		boolean flag=true;
		for(int i=0;i<n;i++)
		{	int sum1=0;
			if(i==0)
			{
			for(int j=0;j<n;j++)
				sum+=m1[i][j];
			}
			else
			{
			for(int j=0;j<n;j++)
			{
				sum1+=m1[i][j];
			}
			}
			if(i!=0 && sum!=sum1 )
				{
				flag=false;
				break;
				}
		}	
		return flag;
	}	
}
