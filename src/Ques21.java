import java.util.Scanner;
public class Ques21{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter USN");
		String USN = sc.next();
		Ques21 obj = new Ques21();
		if(obj.TestUSN(USN))
			System.out.println("SUCCESS");
		else
			System.out.println("FAILURE");
		sc.close();
	}
	
	boolean TestUSN(String USN) {
		boolean c1= USN.length()==10;
		boolean c2= (USN.charAt(0)=='0' || USN.charAt(0)=='1');
		boolean c3= (USN.charAt(1)>=65&&USN.charAt(2)<=90);
		boolean c4= (USN.charAt(3)>=48 &&USN.charAt(3)<=57) && (USN.charAt(4)>=48 &&USN.charAt(4)<=57);
		boolean c5= con5(USN);
		boolean c6=(USN.charAt(7)>=48 &&USN.charAt(7)<=57) && (USN.charAt(8)>=48 &&USN.charAt(9)<=57) && (USN.charAt(9)>=48 &&USN.charAt(9)<=57);

		
		if(c1 && c2 && c3 && c4 && c5 && c6 )
			return true;
		else 
			return false;
	}
	
	boolean con5(String USN) {
		char[] uc = new char[2];
		uc[0]=USN.charAt(5);
		uc[1]=USN.charAt(6);
		String s =new String(uc);
		if(USN.charAt(5)>=65&&USN.charAt(6)<=90)
		{
			if(s.equals("CS") || s.equals("IS") || s.equals("ME") || s.equals("EC"))
					return true;
			else 
				return false;
		}
		else
			return false;
	}

}
