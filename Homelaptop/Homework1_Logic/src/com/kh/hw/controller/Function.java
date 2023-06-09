package com.kh.hw.controller;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Function {

	private static Scanner sc = new Scanner(System.in);

	public static void kandangyesangi() {

		System.out.println("===== 1. 간단 계산기=====");
		System.out.print("첫번째 정수를 입력해주세요. : ");
		int kannum1 = sc.nextInt();
		System.out.print("연산자를 입력해주세요 : ");
		char kannum3 = sc.next().charAt(0);
		System.out.print("두번째 정수를 입력해주세요. : ");
		int kannum2 = sc.nextInt();

		int kannum4;
		System.out.printf("%d %s %d = ", kannum1, kannum3, kannum2);

		switch (kannum3) {
		case '+':
			System.out.println(kannum4 = kannum1 + kannum2);
			break;
		case '-':
			System.out.println(kannum4 = kannum1 - kannum2);
			break;
		case '*':
			System.out.println(kannum4 = kannum1 * kannum2);
			break;
		case '/':
			System.out.println(kannum4 = kannum1 / kannum2);
			break;
		case '%':
			System.out.println(kannum4 = kannum1 % kannum2);
			break;
		}
	}

	public static void hapgye() {
		System.out.println("===== 2. 작은 수에서 큰 수까지 합계 =====");
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int hapnum1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int hapnum2 = sc.nextInt();
		int sum = 0;

		if (hapnum1 < hapnum2) {
			for (int i = hapnum1; i <= hapnum2; i++) {
				System.out.print(i + " ");
				sum += i;
			}
		} else if (hapnum1 > hapnum2) {
			for (int j = hapnum2; j <= hapnum1; j++) {
				System.out.print(j + " ");
				sum += j;
			}
		} else {
			System.out.print(hapnum1 + hapnum2);
		}
		System.out.println("");
		System.out.println("합계 : " + sum);
	}

	public static void sinsang() {
		System.out.println("===== 3. 신상 정보 확인 =====");
		System.out.print("이름 			: ");
		String name = sc.next();
		System.out.print("학년	(숫자만)	: ");
		int year = sc.nextInt();
		System.out.print("반	(숫자만)	: ");
		int ban = sc.nextInt();
		System.out.print("번호	(숫자만)	: ");
		int bunho = sc.nextInt();
		System.out.print("성별	(M/F)	: ");
		String gender = sc.next().toUpperCase();
		System.out.print("성적	(소수점 아래 둘째 자리 까지 ) : ");
		double point = sc.nextDouble();

		if (gender.equals("M")) {
			gender = "남";
		} else if (gender.equals("F")) {
			gender = "여";
		}

		System.out.printf(" %d학년 %d반 %d번 %s %s학생의 성적은 %.2f 이다.", year, ban, bunho, name, gender, point);
		System.out.println("");
	}

	public static void studentinfo() {

	}

	public static void startosuji() {

	}

	public static void nansu() {

	}

	public static void gugudan() {

	}

	public static void dicesuji() {

	}

	public static void stop() {
//		System.out.println("종료")/;

//		return;

	}

}

//Run에서 Menu 사용, Menu에서 Function 사용
//Run클래스에 main()를 구현하여 main()메소드에는 Menu클래스의 displayMenu()메소드 실행

//	메소드 명 : public void displayMenu(){}
//	1. displayMenu() 메소드에 메뉴 화면이 반복 출력되게 함
//	2. 메뉴 번호를 입력 받아 해당 번호의 기능이 실행되게 함
//	3. 메뉴 1~8번까지의 실행용 메소드는 Function클래스의 메소드 호출
//	4. 9번 입력 시 “종료합니다.” 출력 후 종료
//	5. 잘 못 입력 했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력
