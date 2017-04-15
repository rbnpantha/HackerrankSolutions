import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Poles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		Map hm = new HashMap<Integer, Integer>();
		for (int a0 = 0; a0 < n; a0++) {
			int x_i = in.nextInt();
			int w_i = in.nextInt();
			hm.put(x_i, w_i);
			arr[a0] = x_i;
		}
		int sum = 0;
		Arrays.sort(arr);
		int base = 0;
		for (int i = 0; i < n; i++) {

			 
			if (i == base) {
				continue;
			} else {
				//System.out.println((int) hm.get(arr[i]) * (arr[i] - arr[base]));
				sum = sum + (int) hm.get(arr[i]) * (arr[i] - arr[base]);
			}
			if (k > base + 1 ) {
				base = base + 2;
				/*if (base >= k - 1) {
					base = base - 2;
				}*/
			}
		}
		System.out.println(sum);
	}
}
