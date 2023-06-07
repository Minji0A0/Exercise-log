package com.kh.practice.chap02;

import java.util.Scanner;

public class banbokmun {

	public static void main(String[] args) {
		banbokmun banboks = new banbokmun();
		banboks.banbok1();
		banboks.banbok2();
		banboks.banbok3();
		banboks.banbok4();
		banboks.banbok5();
		banboks.banbok6();
		banboks.banbok7();
		banboks.banbok8();
		banboks.banbok9();
		banboks.banbok10();
		banboks.banbok11();
		banboks.banbok12();
		banboks.banbok13();
		banboks.banbok14();
	}

	public static Scanner sc = new Scanner(System.in);

	public void banbok1() {
		System.out.println("■■■■■ 실습문제 1 ■■■■■■");
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number1 = sc.nextInt();
		while (number1 < 1) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			number1 = sc.nextInt();
		}
		for (int i = 1; i <= number1; i++) {
			System.out.print(i + " ");
		}
	}

	public void banbok2() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 2 ■■■■■■");
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number2 = sc.nextInt();

		while (number2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요. ");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			number2 = sc.nextInt();
		}
		for (int i = 1; i <= number2; i++) {
			System.out.print(i + " ");
		}
	}

	public void banbok3() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 3 ■■■■■■");
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number3 = sc.nextInt();
		if (number3 < 1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
		} else {
			for (int i = number3; i >= 1; i--) {
				System.out.print(" " + i);
			}
		}
	}

	public void banbok4() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 4 ■■■■■■");
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number4 = sc.nextInt();

		while (number4 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요. ");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			number4 = sc.nextInt();
		}
		for (int i = number4; 1 <= i; i--) {
			System.out.print(" " + i);
		}
	}

	public void banbok5() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 5 ■■■■■■");
		System.out.print("정수를 하나 입력하세요 : ");
		int number5 = sc.nextInt();

		for (int i = 1; number5 >= i; i++) {
			System.out.print(i);
			if (i != number5) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = ");

		int sum = 0;
		for (int i = 1; number5 >= i; i++) {
			sum += i;
		}
		System.out.print(sum);
	}

	public void banbok6() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 6 ■■■■■■");
		System.out.print("첫 번째 숫자 : ");
		int number6a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int number6b = sc.nextInt();

		if (number6a < 1 || number6b < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if (number6a < number6b) {
			for (int i = number6a; i <= number6b; i++) {
				System.out.print(i + " ");
			}
		} else if (number6a > number6b) {
			for (int i = number6b; i <= number6a; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void banbok7() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 7 ■■■■■■");
		System.out.print("첫 번째 숫자 : ");
		int number7a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int number7b = sc.nextInt();

		while (number7a < 1 || number7b < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			number7a = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			number7b = sc.nextInt();
		}
		if (number7a > number7b) {
			for (int i = number7b; i <= number7a; i++) {
				System.out.print(i + " ");
			}
		} else if (number7b > number7a) {
			for (int i = number7a; i <= number7b; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void banbok8() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 8 ■■■■■■");
		System.out.print("구구단 숫자 : ");
		int number8 = sc.nextInt();

		System.out.println("====" + number8 + "====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", number8, i, number8 * i);
		}
	}

	public void banbok9() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 9 ■■■■■■");
		System.out.print("숫자 : ");
		int number9 = sc.nextInt();

		while (number9 > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요. ");
			System.out.println("숫자 : ");
			number9 = sc.nextInt();
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d \n", number9, i, number9 * i);
		}
	}

	public void banbok10() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 10 ■■■■■■");
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int number10 = sc.nextInt();

		while (number10 > 9) {
			System.out.println("9 이하의 숫자를 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			number10 = sc.nextInt();
		}
		for (int i = number10; i < 10; i++) {
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; 9 >= j; j++) {
				System.out.printf("%d * %d = %2d \n", i, j, i * j);
			}
			System.out.println("");
		}
	}

	public void banbok11() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 11 ■■■■■■");
		System.out.print("시작 숫자 : ");
		int number11a = sc.nextInt();
		System.out.print("공차 : ");
		int number11b = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(number11a + " ");
			number11a += number11b;
		}

	}

	public void banbok12() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 12 ■■■■■■");
		System.out.print("연산자 (+, -, *, /, %) : ");
		String number12a = sc.next();
		if (number12a.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.print("정수1 : ");
			int number12b = sc.nextInt();
			System.out.print("정수2 : ");
			int number12c = sc.nextInt();

			while (number12a.equals("/") && (number12b == 0 || number12c == 0)) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				System.out.print("연산자 (+, -, *, /, %) : ");
				number12a = sc.next();
				System.out.print("정수1 : ");
				number12b = sc.nextInt();
				System.out.print("정수2 : ");
				number12c = sc.nextInt();
			}

			int result = 0;

			switch (number12a) {

			case "+":
				result = number12b + number12c;
				break;
			case "-":
				result = number12b - number12c;
				break;
			case "*":
				result = number12b * number12c;
				break;
			case "/":
				result = number12b / number12c;
				break;
			case "%":
				result = number12b % number12c;
				break;
			case "^":
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}

			System.out.println(result);
		}
	}

	public void banbok13() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 13 ■■■■■■");
		System.out.print("정수 입력 : ");
		int number13 = sc.nextInt();

		for (int i = 1; i <= number13; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}

	}

	public void banbok14() {
		System.out.println("");
		System.out.println("■■■■■ 실습문제 14 ■■■■■■");
		System.out.print("정수 입력 : ");
		int number14 = sc.nextInt();

		for (int i = number14; i > 0; i--) {
			for (int j = i; j >0; j--) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}
