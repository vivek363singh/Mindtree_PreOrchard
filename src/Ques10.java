import java.util.*;
public class Ques10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int a=sc.nextInt();
		int b=sc.nextInt();
		List<Integer> mylist = prilist(a,b);
		for(int i=0;i<mylist.size();i++)
			System.out.println(mylist.get(i));
		sc.close();

	}
	
	public static List<Integer> prilist(int a,int b){
		List <Integer> prime = new ArrayList<Integer>();
		
		for(int i=a;i<=b;i++) {
			boolean flag=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true)
				prime.add(i);
		}
		
		return prime;
	}

}
