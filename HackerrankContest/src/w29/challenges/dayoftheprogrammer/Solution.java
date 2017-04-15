package w29.challenges.dayoftheprogrammer;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static int dayCount(int y) {
		if (y % 4 == 0) {

			if (y % 100 == 0) {
				if (y % 400 == 0) {
					return 244;
				} else
					return 243;
			}
			return 244;
		} else {
			return 243;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		// your code goes here
		int day = 256 - dayCount(y);
		System.out.println(day+"."+"09"+"."+y);

	}
}
