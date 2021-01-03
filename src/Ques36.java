import java.util.Scanner;
public class Ques36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of first array");
		int[] arr1= new int[n];
		int[] arr2= new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter the elements of second array");
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		int[] a=uniqueElements(arr1,arr2);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		sc.close();
	}
	
	static int[] uniqueElements(int arr1[], int arr2[]) {
		
		int[] arr3 = new int[arr1.length+arr2.length];
		int k=0;
		
		for(int i=0;i<arr1.length;i++)
		{	boolean flag=true;	
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				arr3[k]=arr1[i];
				k++;
			}
		}
		
		for(int i=0;i<arr2.length;i++)
		{	boolean flag=true;	
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				arr3[k]=arr2[i];
				k++;
			}
		}
		
		int[]  arr4=new int[k];
		for(int i=0;i<k;i++)
			arr4[i]=arr3[i];
		
		return arr4;
		
	}

}
