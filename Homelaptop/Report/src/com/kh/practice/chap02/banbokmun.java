package com.kh.practice.chap02;

import java.util.Scanner;

public class banbokmun {

	public static void main(String[] args) {
		banbokmun banboks = new banbokmun();
//		banboks.banbok1();
//		banboks.banbok2();
//		banboks.banbok3();
//		banboks.banbok4();
//		banboks.banbok5();
//		banboks.banbok6();
//		banboks.banbok7();
//		banboks.banbok8();
//		banboks.banbok9();
//		banboks.banbok10();
//		banboks.banbok11();
//		banboks.banbok12();
//		banboks.banbok13();
//		banboks.banbok14();
//		banboks.banbok15();
//		banboks.banbok16();
		banboks.banbok17();
//		banboks.banbok18();
//		banboks.banbok19();
//		banboks.banbok20();
//		banboks.banbok21();
//		banboks.banbok22();
	}

	public static Scanner sc = new Scanner(System.in);

	public void banbok1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
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
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
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
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다
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
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

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
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
//		ex.
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36

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
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

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
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

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
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
//		ex.
//		숫자 : 4
//		===== 4단 =====
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36

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
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요

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
//		위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요

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
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 17, 22 …
//		5 5 5 5 => 여기서 공차는 5
//		ex.
//		시작 숫자 : 4
//		공차 : 3
//		4 7 10 13 16 19 22 25 28 31

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
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
//		연산자(+, -, *, /, %) : +
//		정수1 : 10
//		정수2 : 4
//		10 + 4 = 14

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
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****

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
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*

		System.out.println("");
		System.out.println("■■■■■ 실습문제 14 ■■■■■■");
		System.out.print("정수 입력 : ");
		int number14 = sc.nextInt();

		for (int i = number14; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	public void banbok15() {
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		ex) 2, 3, 5, 7, 11 

		System.out.println("소수로 계산될 숫자를 입력해주세요 : ");
		int number15a = sc.nextInt();

		if (number15a < 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			boolean prime = true;

			for (int i = 2; i <= Math.sqrt(number15a); i++) {
				if (number15a % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				System.out.println(number15a + ": 소수입니다. ");
			} else {
				System.out.println(number15a + ": 소수가 아닙니다. ");
			}

		}
	}

	public void banbok16() {
//		위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
//		“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		ex) 2, 3, 5, 7, 11 …

		System.out.println("소수로 계산될 숫자를 입력해주세요 : ");
		int number16a = sc.nextInt();
		boolean number16b = false;

		while (number16b = true) {
			if (number16a < 2) {
				System.out.println(" 잘못 입력하였습니다. ");
				System.out.println("소수로 계산될 숫자를 입력해주세요 : ");
				number16a = sc.nextInt();
			} else {
				boolean prime16 = true;
				for (int i = 2; i <= Math.sqrt(number16a); i++) {
					if (number16a % i == 0) {
						prime16 = false;
						break;
					}
				}
				if (prime16) {
					System.out.println(number16a + ": 소수입니다.");
					break;
				} else {
					System.out.println(number16a + ": 소수가 아닙니다.");
					break;
				}
			}
		}
	}

	public void banbok17() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요

		System.out.print("숫자 : ");
		int number17a = sc.nextInt();
		boolean number17b = true;

		while (number17b) {
			if (number17a < 2) {
				System.out.println("잘못 입력 하셨습니다.");
				System.out.print("숫자 : ");
				number17a = sc.nextInt();
			} else {
				int prime17count = 0;
				for (int i = 2; i <= number17a; i++) {
					boolean prime17 = true;
					for (int j = 2; j <= Math.sqrt(i); j++) {
						if (i % j == 0) {
							prime17 = false;
							break;
						}
					}
					if (prime17) {
						System.out.print(i + " ");
						prime17count++;
					}
				}
				System.out.println("\n2부터 " + number17a + "까지 소수의 개수는 " + prime17count + "개입니다.");
				break;
			}
		}
	}

	public void banbok18() {
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
//		ex.
//		자연수 하나를 입력하세요 : 15
//		2 3 4 6 8 9 10 12 14 15 
//		count : 2

	}

	public void banbok19() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****

	}

	public void banbok20() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*

	}

	public void banbok21() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		***
//		*****
//		*******

	}

	public void banbok22() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 5
//		*****
//		* *
//		* *
//		* *
//		*****

	}
}
