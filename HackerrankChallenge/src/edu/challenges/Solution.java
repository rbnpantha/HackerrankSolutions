package edu.challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long large = a;
		long small = a;
		long b = in.nextLong();
		if (b > large)
			large = b;
		else if (b < small)
			small = b;
		long c = in.nextLong();
		if (c > large)
			large = c;
		else if (c < small)
			small = c;
		long d = in.nextLong();
		if (d > large)
			large = d;
		else if (d < small)
			small = d;
		long e = in.nextLong();
		if (e > large)
			large = e;
		else if (e < small)
			small = e;
		
		long minimum = a + b + c + d + e - large;
		long maximum = a + b + c + d + e - small;
		System.out.println(minimum+" "+maximum);

	}
}