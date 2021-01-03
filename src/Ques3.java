import java.util.*;
public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int s=sc.nextInt();
			
		while(s!=1) {
			
			int a=s;
			
			if(s%2==0) {
				s=s/2;	
				count++;
				System.out.println(a+" is even so i take half "+s);	
			}
			else {
				s=(s*3+2);
				count++;
			
				System.out.println(a+" is odd so i make 3n+1 "+s);
			}
		}
		System.out.println("There are total "+count+" steps to reach 1");
		sc.close();
	}
}
