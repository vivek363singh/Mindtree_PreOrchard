import java.util.*;
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int s=sc.nextInt();
		int f=1;
		for(int i=1;i<=s;i++) {
			
			f=i*f;
		}
		System.out.println(f);	
		sc.close();
	}
}
