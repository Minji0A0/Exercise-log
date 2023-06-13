package com.kh.hw.controller;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class Function {

	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();

	String name;

	public static void calculator() {

//		정수 두 개와 연산자 하나를 키보드로 입력 받아 두 정수는 int변수에, 연산문자는 char에 저장
//		연산문자가 +이면 두 정수의 합 계산, -이면 두 정수의 차 계산, x 또는 X이면 두 정수의 곱, 
//		/이면 두 정수의 나누기 몫이나 나누는 수(두 번째 수)가 0이면 “0으로 나눌 수 없습니다.” 출력하고
//		결과 값은 0으로 처리
//		ex.
//		첫 번째 정수 : 5
//		두 번째 정수 : 0
//		연산자(+, -, x, /) : /
//		0으로 나눌 수 없습니다.
//		5 / 0 = 0

		System.out.println("===== 1. 간단 계산기=====");
		System.out.print("첫번째 정수를 입력해주세요. : ");
		int kannum1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요. : ");
		int kannum2 = sc.nextInt();
		System.out.print("연산자를 입력해주세요 : ");
		char kannum3 = sc.next().charAt(0);

		if (kannum3 == '/') {
			if (kannum2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				int kannum4;

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
			System.out.printf("%d %s %d = ", kannum1, kannum3, kannum2);
		}
	}

	public static void totalCalculator() {
//		키보드로 정수 두 개를 입력 받아 두 정수 중 작은 값을 시작 값으로 큰 값을 종료 값으로 사용
//		작은 값에서 큰 값까지 정수 합계를 구함
//		ex.
//		첫 번째 정수 : 3
//		두 번째 정수 : 1
//		1부터 3까지 정수들의 합 : 6

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

	public static void printProfile() {
//		신상 정보들을 자료형에 맞춰 변수에 기록하고 변수에 기록된 값 출력
//		ex.
//		이름 : 박신우
//		나이 : 33
//		성별 : 여자
//		성격 : 소심
//		이름 : 박신우
//		나이 : 33
//		성별 : 여자
//		성격 : 소심

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

	public static void printScore() {
//		키보드로 입력 받은 값들을 변수에 기록하여 변수 값을 화면에 출력
//		점수가 90점 이상이면 A학점, 80이상 90미만이면 B, 70이상 80미만이면 C, 
//		60이상 70미만 D, 60미만 F학점을 매김
//		ex.
//		이름 : 박신우
//		학년 : 3
//		반 : 3
//		번 : 15
//		성별(M/F) : F
//		성적 : 89.75
//		3학년 3반 15번 여학생 박신우의 점수는 89.75이고 B학점입니다

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

	public static void printStarNumber() {

//		정수를 하나 입력 받아 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 아래와 같이 출력
//		ex.
//		정수 : 5 정수 : -5
//		1 양수가 아닙니다.
//		*2
//		**3
//		***4
//		****5

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

	public static void sumRandom() {
//		1부터 100 사이의 정수 중 임의의 정수를 하나 발생시켜 1부터 랜덤 수까지의 합계 출력
//		ex.
//		1부터 70까지의 합 : 2485

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

	public static void exceptGugu() {

//		정수를 하나 입력 받아 그 수가 양수일 때만 그 수의 구구단 출력
//		단 곱하기 수가 입력 받은 단의 배수일 경우 출력 제외
//		ex.
//		정수 : 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 4 = 12
//		3 * 5 = 15
//		3 * 7 = 21
//		3 * 8 = 24

		System.out.println("===== 7. 구구단 =====");
		int dan = 9;
		int su = 9;

		for (int i = 2; i <= dan; i++) {
			for (int j = 1; j <= su; j++) {
				System.out.printf("%d * %d = %2d \n", i, j, i * j);
			}
		}
	}

	public static void diceGame() {

//		두 개의 주사위가 만들어낼 수 있는 모든 경우의 수를 랜덤으로 정하고
//		랜덤으로 정해진 두 주사위 눈의 합이 입력된 수와 같은 경우 “맞췄습니다“ 출력,
//		입력 값과 다르면 “틀렸습니다“ 출력하여 맞출 때까지 반복
//		값을 맞추면 “계속 하시겠습니까? (y/n) : “가 출력되고
//		‘y’ 또는 ‘Y’ 입력 시 새로운 랜덤 수가 정해지고 처음부터 다시 시작, ‘n’ 또는 ‘N’ 입력 시 종료

		System.out.println("===== 8. 주사위 숫자 알아맞추기 게임 =====");
		int dicerandom = random.nextInt(6);
		System.out.println(dicerandom);

		System.out.println("주사위 숫자를 무엇입니까? : ");
		int dice1 = sc.nextInt();

		int count = 0;

		while (true) {
			if (dice1 != dicerandom) {
				System.out.println("틀렸습니다!");
				System.out.println("주사위 숫자를 무엇입니까? : ");
				dice1 = sc.nextInt();
				count++;
			} else if (dice1 == dicerandom) {
				System.out.println(dicerandom + "은 정답입니다!");
				count++;
				break;
			}
		}
		System.out.println(count + "번만에 정답을 맞추셨습니다.");
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
