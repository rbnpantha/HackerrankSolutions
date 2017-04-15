package edu.challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		int countApp = 0;
		int countOrg = 0;

		for (int i = 0; i < apple.length; i++) {
			if (apple[i] >= (s - a))
				countApp++;
		}

		for (int i = 0; i < orange.length; i++) {
			if (orange[i] <= (t - b))
				countOrg++;
		}
		System.out.println(countApp);
		System.out.println(countOrg);

	}
}
