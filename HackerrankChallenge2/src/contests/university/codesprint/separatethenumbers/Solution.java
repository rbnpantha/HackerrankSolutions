package contests.university.codesprint.separatethenumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			// your code goes here
			int count = 0;
			for (int n = 1; n < s.length() / 2 + 1; n++) {
				count++;
				System.out.println("count = " + count);
				int begin = Integer.parseInt(s.substring(0, n));
				int init = begin;
				for (int i = n; i < s.length(); i = i + n) {
					int next = Integer.parseInt(s.substring(i, i + n));
					System.out.println("init = " + init);
					System.out.println("next = " + next);

					if (init+1 == next || Integer.parseInt(s.substring(i, i + n+ 1)) == init + 1) {
						init = next;
						System.out.println("i = " + i);
						System.out.println("s.length() = "+s.length() + " i  + n  " + (i + n));
						if (s.length() - 1 ==i+n) {
							System.out.println("Yes " + begin);
							return;
						}
					} else
						break;
				}
			}
			System.out.println("No");

			/*
			 * for(int i= 0; i< s.length(); i++){ int init = s.charAt(i); int
			 * next = init +1; if(s.charAt(i+1) == next ||
			 * Integer.parseInt(s.substring(i, i+1)) == next){ break; } }
			 */

			/*
			 * int myInit = s.charAt(0); for (int i = 0; i < s.length(); i++) {
			 * if (myInit == Integer.parseInt(s.substring(i, 1))) { break; }
			 * else if (myInit == Integer.parseInt(s.substring(i, 1))){ break; }
			 * else
			 * 
			 * }
			 */
		}
	}
}
