package edu.coursera.week3;

import java.util.Scanner;

public class Change {
	private static int getChange(int m) {
		int total = 0;
		if (m >= 10)
			total += m / 10;
		m = m % 10;
		if (m >= 5)
			total += m / 5;
		m = m % 5;
		if(m >= 1){
			total += m;
		}

		return total;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
