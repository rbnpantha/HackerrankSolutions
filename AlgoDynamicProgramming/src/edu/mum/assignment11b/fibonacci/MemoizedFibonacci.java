package edu.mum.assignment11b.fibonacci;

import java.util.HashMap;
import java.util.Scanner;

public class MemoizedFibonacci {
	static long fibArray[];
	static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		fibArray= new long[n + 1];
		fibArray[0] = 1;
		fibArray[1] = 1;
		System.out.println("The value of "+n+"th Fibonacci number is : "+ fibonacci(n));
		System.out.println("The total memoized calls = " + count);
	}

	public static long fibonacci(long n) {
		count++;
		long fibValue = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (fibArray[(int) n] != 0) {
			return fibArray[(int) n];
		} else {
			fibValue = fibonacci(n - 1) + fibonacci(n - 2);
			fibArray[(int) n] = fibValue;
			return fibValue;
		}
	}

}
