import java.util.*;
public class Ques6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Ques6 obj= new Ques6();
		obj.rec(s);
		sc.close();

	}
	
	public void rec(String s1) {
		System.out.println("Hello "+s1);
	}
	

}
