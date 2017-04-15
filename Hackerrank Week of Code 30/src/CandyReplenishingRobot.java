import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CandyReplenishingRobot {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
       int can = n;
       int total = 0;
        for(int i = 0; i<t ; i++){
        	can = can -c[i];
        	if(can < 5 && i != c.length - 1){
        		
        		int added = n-can;
        		total = total + added;
        		can = can + added;
        	}
        }
        System.out.println(total);
        
    }
}
