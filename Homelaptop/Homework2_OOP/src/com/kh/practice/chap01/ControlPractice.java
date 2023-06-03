package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ControlPractice ControlPractice = new ControlPractice();
		ControlPractice.practice1();
		ControlPractice.practice2();
		ControlPractice.practice3();
		ControlPractice.practice4();
		ControlPractice.practice5();
		ControlPractice.practice6();
		ControlPractice.practice7();
		ControlPractice.practice8();
		ControlPractice.practice9();
		ControlPractice.practice10();

	}

	public void practice1() {
		System.out.println("====== 실습문제 1번 =====");

		String silmenu1 = "입력 ";
		String silmenu2 = "수정 ";
		String silmenu3 = "조회 ";
		String silmenu4 = "삭제 ";
		String silmenu7 = "종료 ";

		System.out.print("메뉴 번호를 입력하세요 : ");
		int serchmenu = sc.nextInt();

		if (serchmenu == 7) {
			System.out.println("프로그램이 종료됩니다.");
		} else if (serchmenu == 1) {
			System.out.println(silmenu1 + "메뉴입니다.");
		} else if (serchmenu == 2) {
			System.out.println(silmenu2 + "메뉴입니다.");
		} else if (serchmenu == 3) {
			System.out.println(silmenu3 + "메뉴입니다.");
		} else if (serchmenu == 4) {
			System.out.println(silmenu7 + "메뉴입니다.");
		}

	}

	public void practice2() {
		System.out.println("====== 실습문제 2번 =====");

		System.out.println("정수를 입력해주세요 : ");
		int siljung1 = sc.nextInt();

		if (siljung1 < 1) {
			System.out.println("양수만 입력해주세요");
		} else if ((siljung1 % 2) == 1) {
			System.out.println("홀수 입니다.");
		} else if ((siljung1 % 2) == 0) {
			System.out.println("짝수 입니다.");
		}

	}

	public void practice3() {
		System.out.println("====== 실습문제 3번 =====");

		System.out.print("국어점수 : ");
		int korpoint = sc.nextInt();

		System.out.print("수학점수 : ");
		int mathpoint = sc.nextInt();

		System.out.print("영어점수 : ");
		int engpoint = sc.nextInt();

		int totalScore1 = korpoint + mathpoint + engpoint;
		double averageScore1 = totalScore1 / 3;

		System.out.println("국어 : " + korpoint);
		System.out.println("수학 : " + mathpoint);
		System.out.println("영어 : " + engpoint);
		System.out.println("합계 : " + totalScore1);
		System.out.println("평균 : " + averageScore1);

		if (korpoint > 39 && mathpoint > 39 && engpoint > 39) {

			if (averageScore1 > 59) {
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void practice4() {
		System.out.println("====== 실습문제 4번 =====");

		System.out.print("1~12 사이의 정수 입력 : ");
		int nalssi1 = sc.nextInt();

		switch (nalssi1) {
		case 1:
			System.out.println(nalssi1 + "월은 겨울 입니다..");
			break;
		case 2:
			System.out.println(nalssi1 + "월은 겨울 입니다..");
			break;
		case 3:
			System.out.println(nalssi1 + "월은 봄 입니다..");
			break;
		case 4:
			System.out.println(nalssi1 + "월은 봄 입니다..");
			break;
		case 5:
			System.out.println(nalssi1 + "월은 봄 입니다..");
			break;
		case 6:
			System.out.println(nalssi1 + "월은 여름 입니다..");
			break;
		case 7:
			System.out.println(nalssi1 + "월은 여름 입니다..");
			break;
		case 8:
			System.out.println(nalssi1 + "월은 여름 입니다..");
			break;
		case 9:
			System.out.println(nalssi1 + "월은 가을 입니다..");
			break;
		case 10:
			System.out.println(nalssi1 + "월은 가을 입니다..");
			break;
		case 11:
			System.out.println(nalssi1 + "월은 가을 입니다..");
			break;
		case 12:
			System.out.println(nalssi1 + "월은 겨울 입니다..");
			break;
		default:
			System.out.println(nalssi1 + "월은 잘못 입력된 달입니다.");
			break;
		}

	}

	public void practice5() {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
		 */

		System.out.println("====== 실습문제 5번 =====");

		String charaterId1 = "myId";
		String charaterPw1 = "myPassword12";

		System.out.print("아이디 : ");
		String memid = sc.next();

		System.out.print("비밀번호 : ");
		String mempw = sc.next();

		if (memid.equals(charaterId1)) {
			if (mempw.equals(charaterPw1)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

	public void practice6() {

		System.out.println("====== 실습문제 6번 =====");

		String gub1 = "관리자";
		String gub2 = "회원";
		String gub3 = "비회원";

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String donggub = sc.next();

		switch (donggub) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글작성");
			break;

		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;

		default:
			System.out.println("관리자/회원/비회원 중 하나를 입력하세요.");
			break;
		}

	}

	public void practice7() {
		System.out.println("====== 실습문제 7번 =====");

		System.out.print("키(m)를 입력해 주세요 : ");
		double tall = sc.nextDouble(); // 1.65
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble(); // 58.4
		double bmi = kg / (tall * tall);
		System.out.println("BMI 지수 : " + (double) bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (23 < bmi && bmi >= 18.5) {
			System.out.println("정상체중");
		} else if (23 >= bmi && bmi < 25) {
			System.out.println("과체중");
		} else if (25 <= bmi && bmi > 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도비만");
		}

	}

	public void practice8() {
		System.out.println("====== 실습문제 8번 =====");

		System.out.print("피연산자1 입력 : ");
		int piyen1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int piyen2 = sc.nextInt();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char piyen3 = sc.next().charAt(0);

		double piyensanja = 0;

		switch (piyen3) {
		case '+':
			piyensanja = piyen1 + piyen2;
			break;
		case '-':
			piyensanja = piyen1 - piyen2;
			break;
		case '/':
			piyensanja = piyen1 / piyen2;
			break;
		case '*':
			piyensanja = piyen1 * piyen2;
			break;
		case '%':
			piyensanja = piyen1 % piyen2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}

		System.out.println(piyen1 + " " + piyen3 + piyen2 + " = " + piyensanja);

	}

	public void practice9() {
		System.out.println("====== 실습문제 9번 =====");

		System.out.print("중간 고사 점수 : ");
		int midpoint = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int lastpoint = sc.nextInt();

		System.out.print("과제 점수 : ");
		int reportpoint = sc.nextInt();

		System.out.print("출석 회수(최대20) : ");
		int countpoint = sc.nextInt();

		double midpoint1 = midpoint / (100 / 20);
		double lastpoint1 = lastpoint / (100 / 30);
		double reportpoint1 = reportpoint / (100 / 30);
		double countpoint1 = countpoint * (100 / 20);
		double total2 = midpoint1 + lastpoint1 + reportpoint1 + countpoint;
		System.out.println("============= 결과 =============");

		System.out.println("중간 고사 점수	(20) : " + midpoint1);
		System.out.println("기말 고사 점수	(30) : " + lastpoint1);
		System.out.println("과제 점수		(30) : " + reportpoint1);
		System.out.println("출석 점수		(20) : " + countpoint);
		System.out.println("총점 : " + total2);

		if (countpoint1 < 31) {
			System.out.println("Fail [출석 회수 부족 ( " + countpoint + " / 20 ) ]");
		} else if (total2 > 69) {
			System.out.println("PASS");
		} else if (total2 < 71) {
			System.out.println("Fail [점수 미달] ");
		}

	}

	public void practice10() {
		System.out.println("====== 실습문제 10번 =====");

		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절 ");
		System.out.println("5. 로그인 ");
		System.out.println("6. 권한 확인 ");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F ");
		System.out.print("선택 : " );
		int munjae1 = sc.nextInt();
		if(munjae1 < 10 ) {
		System.out.print("(실습문제" + munjae1 + " 실행)");
		}
		System.out.println("");

		ControlPractice ControlPractice1 = new ControlPractice();

		switch (munjae1) {
		case 1:
			ControlPractice1.practice1();
			break;

		case 2:
			ControlPractice1.practice2();
			break;
		case 3 :
			ControlPractice1.practice3();
			break;
		case 4:
			ControlPractice1.practice4();
			break;
		case 5:
			ControlPractice1.practice5();
			break;
		case 6:			
			ControlPractice1.practice6();
			break;
		case 7 :
			ControlPractice1.practice7();
			break;
		case 8 :
			ControlPractice1.practice8();
			break;
		case 9 :
			ControlPractice1.practice9();
			break;

		}
		
	}
}
