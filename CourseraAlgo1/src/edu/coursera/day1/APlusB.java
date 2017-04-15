package edu.coursera.day1;

import java.util.Scanner;

class APlusB {
	public static void main(String[] args) {
		System.out.println("Enter two numbers : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a + b);
		s.close();
	}
}