package edu.mum.assignment11b.fibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {
	static int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		System.out.println("The value of "+n+"th Fibonacci number is : "+ calculateFibo(n));
		System.out.println("The total recursive calls = "+ count);
	}

	static long calculateFibo(long n) {
		count++;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		else
			return calculateFibo(n-2) + calculateFibo(n-1);
	}
}
