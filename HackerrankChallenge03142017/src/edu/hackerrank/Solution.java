package edu.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int output[] = new int[n];
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if(grade > 37 && (5 - grade%5)<3 )
                output[a0] = (grade/5)*5 + 5;
            else
            	output[a0] = grade;
        }
        for(int a0=0; a0< n; a0++){
            System.out.println(output[a0]);
        }
    }
}
