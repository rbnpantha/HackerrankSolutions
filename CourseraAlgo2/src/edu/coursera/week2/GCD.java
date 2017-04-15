package edu.coursera.week2;

import java.util.Scanner;

public class GCD {
	private static int gcd_naive(int a, int b) {
		int current_gcd = -1;
		while (current_gcd != 0) {

			current_gcd = a % b;
			if (current_gcd != 0) {
				a = b;
				b = current_gcd;
			}
		}
		return b;

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(gcd_naive(a, b));
	}
}
