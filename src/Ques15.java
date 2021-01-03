import java.util.*;
public class Ques15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ques15 obj = new Ques15();
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		obj.insort(arr);
		obj.prtarr(arr);
		sc.close();
	}

	void insort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	void prtarr(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
