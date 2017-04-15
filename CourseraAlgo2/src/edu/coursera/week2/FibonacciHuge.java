package edu.coursera.week2;

import java.util.Scanner;

public class FibonacciHuge {
	private static long getFibonacciHugeNaive(long n, long m) {
		int num = (int) n;
		//int divisor = (int) m;
		long fibArr[] = new long[num + 1];
		fibArr[1]=fibArr[2] =1;
		
		for (int i = 3; i <= num; i++){
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		return fibArr[num] % m;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		System.out.println(getFibonacciHugeNaive(n, m));
	}
}
