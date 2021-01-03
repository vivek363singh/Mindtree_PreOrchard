import java.util.Scanner;
public class Ques17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("enter name");
		String s = sc.next();
		int count=0;
		char[] chs = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
				chs[count++]=s.charAt(i);	
		}
		String ini = new String(chs);
		System.out.println(ini);
		sc.close();
	}
}
