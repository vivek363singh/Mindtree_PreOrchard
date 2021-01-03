import java.util.*;
public class Ques13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ques13 obj = new Ques13();
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter element to be searched");
		int s=sc.nextInt();
		System.out.println(obj.search(arr,s)); 
		sc.close();
	}
	
	boolean search(int[] arr,int s) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s)
				return true;
		}
		return false;
	}
}
