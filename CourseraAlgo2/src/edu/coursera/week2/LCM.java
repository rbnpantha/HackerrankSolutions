package edu.coursera.week2;

import java.util.Scanner;

public class LCM {
	private static long lcm_naive(int a, int b) {
		long first = a;
		long second = b;
		int current_gcd = -1;
		while (current_gcd != 0) {

			current_gcd = a % b;
			if (current_gcd != 0) {
				a = b;
				b = current_gcd;
			}
		}
		return (first * second)/b;

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcm_naive(a, b));
	}
}
