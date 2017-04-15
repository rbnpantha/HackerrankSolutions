package edu.hackerrank.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class SparseArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		

		String s[] = new String[n+1];
		s[0] = scanner.nextLine();
		for (int x = 1; x <= n; x++) {
			
			s[x] = scanner.nextLine();
			
		}
		
		int q = scanner.nextInt();
		String f[] = new String[q];
		f[0] = scanner.nextLine();
		for (int y = 0; y < q; y++) {
			
			f[y] = scanner.nextLine();
		}
		int count = 0;
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[j].equals(f[i]))
					count++;
			}
			System.out.println(count);
			count = 0;
		}

	}
}
