package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("정수: ");
		int num1 = sc.nextInt();

		if (num1 <= 0) {
			System.out.print("양수가 아닙니다.");
		}

		for (int i = 1; i <= num1; i++)
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		System.out.println();
	}

	public void practice2() {
		System.out.print("정수 : ");
		int num2 = sc.nextInt();
		if (num2 < 1) {
			System.out.println("양수가 아닙니다.");
		}

		while (num2 < 1) {
			System.out.print("정수 : ");
			num2 = sc.nextInt();
			if (num2 < 1) {
				System.out.println("양수가 아닙니다.");
			}
		}
		for (int i = 1; i <= num2; i++)
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		System.out.println();

	}

	public void practice3() {
		System.out.print("문자열 : ");
		String munja3a = sc.next();
		System.out.print("문자 : ");
		char munja3b = sc.next().charAt(0);

		int count = 0;

		for (int i = 0; i < munja3a.length(); i++) {
			if (munja3a.charAt(i) == munja3b) {
				count++;
			}
		}
		System.out.println(munja3a + "안에 포함된 " + munja3b + " 개수 : " + count);

	}

	public void practice4() {

		System.out.print("문자열 : ");
		String munja4a = sc.next();
		System.out.print("문자 : ");
		char munja4b = sc.next().charAt(0);

		int count = 0;

		for (int i = 0; i < munja4a.length(); i++) {
			if (munja4a.charAt(i) == munja4b) {
				count++;
			}
		}
		System.out.println("포함된 개수 : " + count);
		System.out.println("더 하시겠습니까? (y/n) : ");
		char munja4c = sc.next().charAt(0);
		while (true) {
			if (munja4c == 'Y' || munja4c == 'y') {
				System.out.print("문자열 : ");
				munja4a = sc.next();
				System.out.print("문자 : ");
				munja4b = sc.next().charAt(0);
				for (int i = 0; i < munja4a.length(); i++) {
					if (munja4a.charAt(i) == munja4b) {
						count++;
					}
					System.out.println("포함된 개수 : " + count);
				}
			} else if (munja4c == 'N' || munja4c == 'n') {
				System.out.println("더 하시겠습니까? (y/n) : ");
				munja4c = sc.next().charAt(0);
				break;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				System.out.println("더 하시겠습니까? (y/n) : ");
				munja4c = sc.next().charAt(0);
			}

		}
	}
}