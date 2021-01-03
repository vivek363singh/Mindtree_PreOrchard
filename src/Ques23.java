import java.util.Scanner;
public class Ques23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String s =sc.nextLine();
		Ques23 obj = new Ques23();
		obj.printConsecutiveCharacters(s);
		sc.close();
	}
	
	void printConsecutiveCharacters(String s)
	{ 
	  int count=0;
	  String[] st = new String[s.length()];
	  for(int i=0;i<st.length;i++)
		  st[i]="";
	  boolean flag=false;
		for(int i=0;i<s.length()-1;i++) {
			if(i!=s.length()-2)
			{if((s.charAt(i)+1)==s.charAt(i+1) && flag==false) {
				st[count]+=s.charAt(i);
				st[count]+=s.charAt(i+1);
				flag=true;
				System.out.println(st[count]);
			}
			else if((s.charAt(i)+1)==s.charAt(i+1) && flag==true) {
				st[count]+=s.charAt(i+1);
			}
			
			else if((s.charAt(i)+1)!=s.charAt(i+1) && flag==true) {
				flag=false;
				count++;
			}
			}
			else {
				if((s.charAt(i)+1)==s.charAt(i+1)) {
					st[count]+=s.charAt(i);
					st[count]+=s.charAt(i+1);
					System.out.println(st[count]);
					count++;
			}
			}
		
		}
		for(int j=0;j<count;j++)
		{	int count1=1;
			for(int k=j+1;k<count;k++)
			{
				if(st[j].equalsIgnoreCase(st[k]))
					count1++;	
			}
			System.out.println(st[j]+" "+count1);
		}
	}

}
