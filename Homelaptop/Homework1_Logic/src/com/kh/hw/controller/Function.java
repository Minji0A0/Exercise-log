package com.kh.hw.controller;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class Function {

	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();

	String name;

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
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("성격 : ");
		String character = sc.next();

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + character);

	}

	public static void studentinfo() {
		System.out.println("===== 4. 학생 정보 확인 =====");
		System.out.print("이름 		: ");
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

	public static void startosuji() {
		System.out.println("===== 5. 별과 숫자 출력 =====");

		System.out.println("첫번째 정수를 입력해주세요 : ");
		int starnum1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요 : ");
		int starnum2 = sc.nextInt();

		if (starnum1 < starnum2) {
			for (int i = starnum1; i <= starnum2; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else if (starnum1 > starnum2) {
			for (int i = starnum1; i >= starnum2; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

	public static void nansu() {
		System.out.println("===== 6. 난수까지의 합계 =====");

		int nansunum1 = random.nextInt(100);
		System.out.println(nansunum1);
		int sum = 0;

			if (nansunum1 < 0) {
				System.out.println("0이상 입력해주세요.");
				nansunum1 = random.nextInt(100);
				System.out.println(nansunum1);
			} else {
				for (int i = 1; i <= nansunum1; i++) {
					sum += i;
				}
			}
		System.out.println("1부터 " + nansunum1 + "까지 난수의 합산은 " + sum + " 입니다.");
	}

	public static void gugudan() {
		System.out.println("===== 7. 구구단 =====");

	}

	public static void dicesuji() {
		System.out.println("===== 8. 주사위 숫자 알아맞추기 게임 =====");

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
