package edu.challenges;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int big = 0;
        for(int i = 0; i< word.length(); i++){
        	
        	if(h[word.charAt(i)-97] > big)
        		big = h[word.charAt(i)-97];
        }
    	
    	
    	System.out.println(big * 1 * word.length());
    }
}