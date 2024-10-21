package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		int[] fibo = new int[limit];
		System.out.println("Fibonacci Series:");

		for (int i=2; i<limit; i++) {
			fibo[0] = 0;
			fibo[1] = 1;
			fibo[i] = fibo[i-1] + fibo[i-2];

			// System.out.print(limit + " ");
			
		}
		System.out.println(Arrays.toString(fibo));
	
		
		
		
	}

}
