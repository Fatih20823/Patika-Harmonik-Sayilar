package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("N sayisi giriniz: ");
		int n = input.nextInt();
		double total=0;
		double temp=1;
	
//		for (double i = 2; i <=n; i++) {
//			total+=(1/i);
//		}		
//		System.out.println(total);
		
		while(temp<=n) {
			total +=1/temp;
			temp++;
		}
		System.out.println(total);
	}

}
