import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ON2runningTime {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int diff = Math.abs(a[0] - a[1]);
	       for (int i=0; i<n-1; i++){
	         for (int j=i+1; j<n; j++){
	          if (Math.abs(a[i] - a[j]) < diff)
	                diff = Math.abs(a[i] - a[j]);
	       }
	    }
	        System.out.println(diff);
	    }
}
