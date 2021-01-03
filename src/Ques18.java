import java.util.Scanner;
public class Ques18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ques18 ob= new Ques18();
		System.out.println("Enter first name");
		String s1 =sc.next();
		System.out.println("Enter middle name");
		String s2 =sc.next();
		System.out.println("Enter last name");
		String s3 =sc.next();
		System.out.println("Enter Age");
		int a =sc.nextInt();
		System.out.println(ob.getpass(s1,s2,s3,a));;
		sc.close();
	}
	
	String getpass(String s1,String s2, String s3,int a) {
		StringBuilder sb = new StringBuilder();
		sb.append(s1.charAt(0));
		sb.append(s2.charAt(0));
		sb.append(s3.charAt(0));
		sb.append('@');
		sb.append(a);
		return sb.toString();
	}


}
