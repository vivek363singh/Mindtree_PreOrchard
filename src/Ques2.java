import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		int i=1;
		while(i<=12) {
			int a;
			a=s*i;
			System.out.println(s+"*"+i+"="+a);
			i++;
		}
		sc.close();
	}

}
