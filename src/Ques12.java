import java.util.*;
public class Ques12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ques12 obj = new Ques12();
		
		System.out.println("Enter");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		obj.bbsort(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"	");
		sc.close();

	}
	
	  void bbsort(int[] arr1) {
	        int n = arr1.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr1[j] > arr1[j+1]) 
	                {  
	                    int temp = arr1[j]; 
	                    arr1[j] = arr1[j+1]; 
	                    arr1[j+1] = temp; 
	                } 	
	}

}
