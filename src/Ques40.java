import java.util.*;
public class Ques40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of row and coulmn");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter the elements");
		int[][] m1=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				m1[i][j]=sc.nextInt();
		}
		if(isMagic(m1))
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();

	}
	
	public static boolean isMagic(int[][] m1) {
		boolean flag=true;
		int n=m1.length;int sum=0;
		//square check
		for(int i=0;i<n;i++) {
			if(n!=m1[i].length)
			{
				flag=false;
				
			}
		}
		//row-sum check
		for(int i=0;i<n;i++)
		{	int sum1=0;
			if(i==0)
			{
			for(int j=0;j<m1[i].length;j++)
				sum+=m1[i][j];
			}
			else
			{
			for(int j=0;j<m1[i].length;j++)
			{
				sum1+=m1[i][j];
			}
			}
			if(i!=0 && sum!=sum1 )
				{
				flag=false;
				}
		}
		//column-sum check
		for(int i=0;i<m1[i].length;i++)
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
				}
		}
		
		return flag;
	}

}
