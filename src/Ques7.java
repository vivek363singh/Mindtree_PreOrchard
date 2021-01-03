import java.util.*;
public class Ques7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(max(a,b,c));
		sc.close();
	}

	public static int max(int a, int b, int c) {
		if(a>b) {
			if(a>c)
				return a;
			else return c;
		}
		else {
			if(b>c)
				return b;
			else
				return c;
		}
		
	}
}
