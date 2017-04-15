package contests.university.codesprint.separatethenumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		String str[] = new String[q];
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			// your code goes here
			str[a0] = s;

		}
		for (int val = 0; val < str.length; val++) {
			String s = str[val];
			int count = 0;
			for (int n = 1; n < s.length() / 2 + 1; n++) {
				count++;
				System.out.println("count = " + count);
				int begin = Integer.parseInt(s.substring(0, n));
				int init = begin;
				for (int i = n; i < s.length(); i = i + n) {
					int next1 = Integer.parseInt(s.substring(i, i + n));
					int next2 = Integer.parseInt(s.substring(i, i + n+1));
					System.out.println("i = " + i + "  "+ " n = " + n);
					System.out.println("init = " + init);
					System.out.println("next1 = " + next1 + "  "+ "next2 = " + next2);

					if (init + 1 == next1 || next2 == init + 1) {
					
						init = init +1;
						
						System.out.println("i = " + i);
						System.out.println("s.length() = " + s.length() + " i  + n  " + (i + n));
						if (s.length() % 2 != 0 || n == 1) {
							if (s.length() - 1 == i + n) {
								System.out.println("Yes " + begin);
								return;
							}
						}
						else {
							
							if (s.length() == i + n) {
								System.out.println("Yes " + begin);
								return;
							}
						}
						

					} else
						break;
				}
			}
			System.out.println("No");

		}
}
}
