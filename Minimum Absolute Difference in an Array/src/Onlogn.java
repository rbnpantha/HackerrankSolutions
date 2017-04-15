import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Onlogn {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int diff = Math.abs(a[0] - a[1]);
       for (int i=1; i<n-1; i++){
          if (Math.abs(a[i+1] - a[i]) < diff)
                diff = Math.abs(a[i+1] - a[i]);
       
    }
        System.out.println(diff);
    }
}
