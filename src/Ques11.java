import java.util.*;
public class Ques11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type");
		String s= sc.next();
		if(s.equals("triangle")==true) {
			int l=sc.nextInt();
			int b=sc.nextInt();
			double d =areat(l,b);
			System.out.println(d);
		}
		if(s.equals("square")==true) {
			int si=sc.nextInt();
			double d=areas(si);
			System.out.println(d);
			
		}
		if(s.equals("circle")==true) {
			int r=sc.nextInt();
			double d=areac(r);
			System.out.println(d);
		}
		if(s.equals("rectangle")==true) {
			int w=sc.nextInt();
			int h=sc.nextInt();
			double d=arear(w,h);
			System.out.println(d);			
		}
		sc.close();
	}

	public static int areat(int l,int b) {
		return (l*b)/2;
	}
	public static int arear(int l,int b) {
		return (l*b);
	}
	public static double areac(int r) {
		return 3.14*(r*r);
	}
	public static int areas(int s) {
		return (s*s);
	}
}
