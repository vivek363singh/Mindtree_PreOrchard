import java.util.Scanner;
public class Ques22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String s =sc.nextLine();
		//String s="java string split method by javatpoint";
		String[] words=s.split(" ");
		String revstring="";
		for(int i=0;i<words.length;i++)
		{
			String revword="";
			int[] arr =new int[words[i].length()];
			int count =0;
			int k=0;
			for(int j=words[i].length()-1;j>=0;j--) {
				if((words[i].charAt(j)>=65&&words[i].charAt(j)<=90)||(words[i].charAt(j)>=96&&words[i].charAt(j)<=122))
				{ 
				arr[k]=words[i].length()-j-1;
				  k++;
				}
			}
			for(int z=0;z<arr.length;z++) {
				System.out.println(arr[z]);
			}
			for(int j=words[i].length()-1;j>=0;j--) {
				
				if(!(words[i].charAt(j)>=65&&words[i].charAt(j)<=90)||(words[i].charAt(j)>=96&&words[i].charAt(j)<=122))
					{
					revword+=words[i].charAt(arr[count]);
					count++;
					}
				
				//if((words[i].charAt(j)>=65&&words[i].charAt(j)<=90)||(words[i].charAt(j)>=96&&words[i].charAt(j)<=122))
				else	
					revword+=words[i].charAt(j);
					
			}
			if(i==words.length-1)
				revstring=revstring+revword;
			else
				revstring+=revword+" ";
		}
		//System.out.println(revstring);
		sc.close();

	}

}
