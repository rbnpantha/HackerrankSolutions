package edu.hackerrank.arrays;

import java.util.Scanner;

public class LeftRotation {

	public static int[] rotate(int[] arr, int r) {
		int[] clone = new int[arr.length];
		int count = 0;
		for (int i = r; i < arr.length; i++) {
			clone[count] = arr[i];
			count++;
		}
		
		for (int i = 0; i < r; i++) {
			clone[count] = arr[i];
			count++;
		}
		
		

		

		return clone;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int r = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] newArr = rotate(arr, r);
		for(int i=0; i<newArr.length; i++){
		System.out.println(newArr[i]);
		}
		scanner.close();
	}
}