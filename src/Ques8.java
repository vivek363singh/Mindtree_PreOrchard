import java.util.*;
public class Ques8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(rev(a));
		sc.close();
	}
	
	public static int rev(int a) {
		
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;		
		}
		
		return rev;
	}
	

}
