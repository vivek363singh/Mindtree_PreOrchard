import java.util.Scanner;
public class Ques16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ques16 obj = new Ques16();
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		String[] arr= new String[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.next();
		System.out.println("1.Insertion sort,2.Bubble sort");
		int c=sc.nextInt();
		switch(c) {
		case 1:	obj.insort(arr);
				obj.prtarr(arr);
				break;
		case 2: obj.bbsort(arr);
				obj.prtarr(arr);
				break;
		}
		sc.close();
	}

	void insort(String[] arr) {
		for(int i=1;i<arr.length;i++) {
			String key=arr[i];
			int j=i-1;
			
			while(j>=0 && key.compareTo(arr[j])<0){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	void bbsort(String[] arr1) {
        int n = arr1.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr1[j].compareTo(arr1[j+1])>0) 
                {  
                    String temp = arr1[j]; 
                    arr1[j] = arr1[j+1]; 
                    arr1[j+1] = temp; 
                } 	
	}
	
	void prtarr(String[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
