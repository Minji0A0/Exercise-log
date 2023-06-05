package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		System.out.println("정수: " + num1);

		if (num1 % 2 == 0) {
			for (int i = 0; i <= num1; i++) {
				System.out.print(num1);
			}
		}
	}
}
