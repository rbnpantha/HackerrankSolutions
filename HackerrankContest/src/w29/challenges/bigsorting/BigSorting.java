package w29.challenges.bigsorting;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {
	private static String[] numbers;
	private static int number;
	
	
	public static void sort(String[] values) {
		// check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}
		System.out.println("length is : " +values.length);
		for(int i = 0; i< values.length; i++){
			System.out.println(values[i]);
			
		}
		numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}
	
	
	
	private static void quicksort(int low, int high) {
		int i = low, j = high;
		BigInteger pivot = new BigInteger(numbers[low + (high - low) / 2]);
		while (i <= j) {
			
			while ((new BigInteger(numbers[i])).compareTo(pivot) ==-1) {
				i++;
			}
		
			while ((new BigInteger(numbers[j])).compareTo(pivot) ==1) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
	
	/*private static void quicksort(int low, int high) {
		System.out.println("inside qicksort method!! and low = " + low + " high = "+high);
		int i = low, j = high;
		BigInteger pivot = new BigInteger(numbers[low + (high - low) / 2]);
		System.out.println("pivot is : "+pivot);
		while (i <= j) {
		
			while ((new BigInteger(numbers[i])).compareTo(pivot) ==-1) {
				System.out.println("inside while 1");
				i++;
			}
			
			while ((new BigInteger(numbers[i])).compareTo(pivot) ==1) {
				System.out.println(" number is " +numbers[i] + "  and pivot is : "+pivot + " j = " + j);
				System.out.println("inside while 2");
				j--;
			}

		
			if (i <= j) {
				System.out.println("inside if");
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j){
			System.out.println( "low "+ low + " j "+ j);
			quicksort(low, j);
		}
			
		if (i < high){
			System.out.println( "i "+ i + " high "+ high);
			quicksort(i, high);
		}
	}
	*/
	
	

	static private void exchange(int i, int j) {
		System.out.println("inside exchange method!!");
		String temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the number of items");
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        System.out.println("Enter each numbers");
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }
	        System.out.println("Total reached!!");
	        // your code goes here
	        sort(unsorted);
			for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
	    }
}
