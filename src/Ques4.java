import java.util.*;
public class Ques4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int sum=0;
		int i=0;
		int arr[]=new int[s];
		while(i<s) {
			arr[i]=sc.nextInt();
			
			sum=sum+arr[i];
			i++;
		}
		for(int j=0;j<s;j++) {
			System.out.print(arr[j]+"	");
		}
		System.out.println("sum is  "+sum);
		sc.close();
	}

}
