package edu.mum.assignment11b.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	static int recursiveCount = 0;
	static long fibArray[];
	static int memoizedcount = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		System.out.println("The value of "+n+"th Fibonacci number using recursion is : "+ calculateRecursiveFibo(n));
		System.out.println("The total recursive calls = "+ recursiveCount);
		
		/*using memoized version*/
		fibArray= new long[n + 1];
		fibArray[0] = 1;
		fibArray[1] = 1;
		System.out.println("The value of "+n+"th Fibonacci number using memoization is : "+ calculateMemoizedfibonacci(n));
		System.out.println("The total memoized calls = " + memoizedcount);
		
		
	}

	static long calculateRecursiveFibo(long n) {
		recursiveCount++;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		else
			return calculateRecursiveFibo(n-2) + calculateRecursiveFibo(n-1);
	}
	
	public static long calculateMemoizedfibonacci(long n) {
		memoizedcount++;
		long fibValue = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (fibArray[(int) n] != 0) {
			return fibArray[(int) n];
		} else {
			fibValue = calculateMemoizedfibonacci(n - 1) + calculateMemoizedfibonacci(n - 2);
			fibArray[(int) n] = fibValue;
			return fibValue;
		}
	}
}
