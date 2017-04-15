package contests.university.codesprint.breakingtherecord;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int highest = score[0];
        int lowest = score[0];
        int countHighest = 0;
        int countLowest = 0;
        
        for(int i =1; i<score.length;i++){
        	if(score[i] > highest){
        		highest = score[i];
        		countHighest++;
        	}
        	else if(score[i] < lowest){
        		lowest = score[i];
        		countLowest++;
        	}
        }
        System.out.println(countHighest + " " + countLowest);
    }
}