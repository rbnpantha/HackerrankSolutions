package edu.coursera.week2;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
	private static BigInteger calc_fib(int n) {
		 if (n <= 1){
		      return new BigInteger(String.valueOf(n));
		 }
		 
		BigInteger fibArr[] = new BigInteger[n+1];
		fibArr[1]=fibArr[2] =new BigInteger("1");;
		
		for (int i = 3; i <= n; i++){
			fibArr[i] = fibArr[i-1].add(fibArr[i-2]);
		}
		return fibArr[n];
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(calc_fib(n));
	}
}
