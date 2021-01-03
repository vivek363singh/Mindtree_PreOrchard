import java.io.*;
import java.util.*;


public class rough {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		send(arr);
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]+"-----------------"+i);
		}
	
	}
	
	static void send(int[] arr1) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr1[i]=sc.nextInt();
		}
	}
}
	/*while(flag) {
	try {
		System.out.println("Enter a number");
	c= sc.nextInt();
	flag=false;
	}
	catch(InputMismatchException e) {
		sc.next();
		System.out.println("Please enter a valid number\n");
		flag=true;
	}
		
	}*/
	
	/*
	 * public static int maximum(int[] numbers) { int resultMaximum =
	 * Integer.MIN_VALUE; int numbersLength = numbers.length; while (numbersLength--
	 * > 0) { int number = numbers[numbersLength]; if (number > resultMaximum) {
	 * resultMaximum = number; } } return resultMaximum; } public static int
	 * sumAmountOfElements(int[] numbers, int startIndex, int amount) { int
	 * resultSum = 0; String stringSum = ""; while (amount-- > 0) { stringSum +=
	 * numbers[startIndex + amount] + " + "; resultSum += numbers[startIndex +
	 * amount]; } System.out.print("index: [" + startIndex + "] (" + stringSum +
	 * ") + "); return resultSum; } public static int specialSum(int startIndex,
	 * int[] numbers) { int resultSpecialSum = 0; int numbersLength =
	 * numbers.length; int amount = 1; int index = startIndex; String stringSum =
	 * ""; while ((index + amount) <= numbersLength) { int littleSum =
	 * sumAmountOfElements(numbers, index, amount); stringSum += littleSum + " + ";
	 * resultSpecialSum += littleSum; index += amount; amount++; }
	 * System.out.println(" = " + resultSpecialSum); return resultSpecialSum; }
	 * public static int[] specialSums(int[] numbers) { int numbersLength =
	 * numbers.length; int[] resultSpecialSums = new int[numbersLength]; for (int
	 * index = 0; index < numbersLength; index++) { resultSpecialSums[index] =
	 * specialSum(index, numbers); } System.out.println("Special Sums: " +
	 * Arrays.toString(resultSpecialSums)); return resultSpecialSums; } public
	 * static int bestIndex(int[] numbers) { return maximum(specialSums(numbers)); }
	 * public static void main(String args[] ) throws Exception { // Scanner
	 * userInput = new Scanner(System.in); ////
	 * System.out.println("Please enter the amount of numbers: "); // String
	 * stringAmountNumbers = userInput.nextLine().trim(); // int amountNumbers =
	 * Integer.parseInt(stringAmountNumbers); ////
	 * System.out.println("Please enter the numbers separeted by spaces: "); //
	 * int[] numbers = new int[amountNumbers]; // String stringArray =
	 * userInput.nextLine(); // String[] numbersString = stringArray.split(" "); //
	 * for (int index = 0; index < numbersString.length; index++) { //
	 * numbers[index] = Integer.parseInt(numbersString[index]); // } // int
	 * resultBestIndex = bestIndex(numbers); // System.out.println(resultBestIndex);
	 * 
	 * // int[] numbers = new int[]{1, 3, 1, 2, 5}; // 2 1 3 9 2 4 -10 -9 1 3 int[]
	 * numbers = new int[]{2, 1, 3, 9, 2, 4, -10, -9, 1, 3}; // int[] numbers = new
	 * int[]{-3, 2, 3, -4, 3, 1}; // int[] specialSums = specialSums(numbers); int
	 * resultBestIndex = bestIndex(numbers); System.out.println("Amount Numbers: " +
	 * numbers.length); System.out.println("Numbers: " + Arrays.toString(numbers));
	 * // System.out.println("Special Sums: " + Arrays.toString(specialSums));
	 * System.out.println("Best Index: " + resultBestIndex); }
	 */

