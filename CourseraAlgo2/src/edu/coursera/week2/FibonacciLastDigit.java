package edu.coursera.week2;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLastDigit {
	private static BigInteger getFibonacciLastDigitNaive(int n) {
		BigInteger fibArr[] = new BigInteger[n+1];
		fibArr[1]=fibArr[2] =new BigInteger("1");;
		
		for (int i = 3; i <= n; i++){
			fibArr[i] = fibArr[i-1].add(fibArr[i-2]);
		}
		return fibArr[n].mod( new BigInteger("10"));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(getFibonacciLastDigitNaive(n));
	}
}
