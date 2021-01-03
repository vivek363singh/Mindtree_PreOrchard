import java.util.Scanner;
public class Ques26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c_id=455;
		int bill_id=0,Purchase_id=0;
		boolean flag=true;
		System.out.println("Enter ids");
		int[] ids = new int[5];
		for(int i=0;i<ids.length;i++)
			ids[i]=sc.nextInt();
		System.out.println("Enter price");
		double[] price = new double[5];
		for(int j=0;j<price.length;j++)
			price[j]=sc.nextDouble();
		System.out.println("Enter item id to be searched");
		int search_id=sc.nextInt();
		for(int i=0;i<ids.length;i++)
		{
			if(ids[i]==search_id)
			{	bill_id++;
				Purchase_id++;
				System.out.println("Enter the quantity of item required");
				int quantity = sc.nextInt();
				double bill_amount=quantity*price[i];
				System.out.println("Customer_id "+c_id);
				System.out.println("Bill id " + bill_id);
				System.out.println("Purchase id " + Purchase_id );
				System.out.println("Quantity purchased "+ quantity);
				System.out.println("Bill amount " + bill_amount);
				flag=false;
			}
		}
		if(flag==true)
			System.out.println("Item not found");
		sc.close();
	}
}
