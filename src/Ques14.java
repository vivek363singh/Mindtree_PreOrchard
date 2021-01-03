import java.util.*;
public class Ques14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ques14 obj = new Ques14();
		System.out.println("Enter array size - Integers");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter array size - Strings");
		int n1=sc.nextInt();
		String[] arr1=new String[n1];
		System.out.println("Enter elements");
		for(int i=0;i<n1;i++)
			arr1[i]=sc.next();
		while(true) {
		System.out.println("1.Binary search for integers,2.Binary search for strings,3.Exit");
		System.out.println("Enter your choice");
		int c=sc.nextInt();
		switch(c) {
		case 1:System.out.println("Enter number");
				int e=sc.nextInt();
				System.out.println(obj.bsint(arr,e));
				break;
		
		case 2:System.out.println("Enter String");
				String s=sc.next();
				System.out.println(obj.bsstring(arr1,s));
				break;
		case 3: System.exit(0);
		
		default: System.out.println("Wrong choice");
		}
	}
}

	boolean bsint(int[] arr, int e) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==e)
				return true;
		}
		return false;
	}
	
	boolean bsstring(String[] arr1, String s) {
		for(int i=0;i<arr1.length;i++) {
			if(s.equals(arr1[i]))
				return true;
		}
		return false;
	}
}
