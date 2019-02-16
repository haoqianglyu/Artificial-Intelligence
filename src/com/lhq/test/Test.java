package com.lhq.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		while(true) {
			if((input=sc.nextInt())!=-1){
				System.out.println(input);
			}else {
				System.out.println("Algorithm ends");
				System.exit(0);
			}
		}
		
		
	}
}