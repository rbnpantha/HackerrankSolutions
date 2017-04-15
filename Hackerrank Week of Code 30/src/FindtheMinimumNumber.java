import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindtheMinimumNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(checkMin(n));

	}

	static String checkMin(int i) {

		if (i > 2)
			return "min(int, " +checkMin(--i) +")";
		else 
			return "min(int, int)";
		

	}
}