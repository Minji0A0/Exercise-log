package yensanja.func;

import java.util.Scanner;

public class silmunjae_01 {
	Scanner sc = new Scanner(System.in);
	// close는 가비지 컬렉션이 해결해줌
	public void yeansanja() {

		System.out.println("■■■■ 실습문제 1번 ■■■■");
		/*
		 * 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요. ex. 정수 : -9 양수가 아니다
		 */

		System.out.print("정수 : ");
		int jengsu1 = sc.nextInt();
		if (jengsu1 > 0) {
			System.out.println("양수가 맞다.");
		} else if (jengsu1 < 0) {
			System.out.println();
			System.out.println("양수가 아니다.");

		}
	}

	public void yeansanja2() {
		/*
		 * 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		 * ex. 정수 : -9 음수다
		 */
		System.out.println("■■■■ 실습문제 2번 ■■■■");
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		int jengsu2 = sc.nextInt();

		if (jengsu2 > 0) {
			System.out.println();
			System.out.println("양수다.");
		} else if (jengsu2 < 0) {
			System.out.println();
			System.out.println("음수다.");
		} else if (jengsu2 == 0) {
			System.out.println();
			System.out.println("0 이다.");
		}

	}

	public void yeansanja3() {
		/*
		 * 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요. ex. 정수 : 5 홀수다
		 * 
		 */
		System.out.println("■■■■ 실습문제 3번 ■■■■");
		System.out.println();
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		int jengsu3 = sc.nextInt();

		if (jengsu3 % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}

	}

	public void yeansanja4() {
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고
		 * 남은 사탕의 개수를 출력하세요. ex. 인원 수 : 29 사탕 개수 : 100 1인당 사탕 개수 : 3 남는 사탕 개수 : 13
		 */
		System.out.println("■■■■ 실습문제 4번 ■■■■");
		System.out.print("인원수 : ");
		Scanner sc = new Scanner(System.in);
		int jengsu4 = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int jengsu5 = sc.nextInt();

		int indang1 = (jengsu5 / jengsu4);
		int indang2 = jengsu5 - (indang1 * jengsu4);

		System.out.println("1인당 사탕 개수 : " + indang1);
		System.out.println("남는 사탕 개수 : " + indang2);

	}

	public void yeansanja5() {
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면
		 * 여학생으로 출력 처리 하세요. ex. 이름 : 박신우 학년(숫자만) : 3 반(숫자만) : 4 번호(숫자만) : 15 성별(M/F) : F
		 * 성적(소수점 아래 둘째자리까지) : 85.75 3
		 * 
		 * 학년 4반 15번 박신우 여학생의 성적은 85.75이다.
		 */

		System.out.println("■■■■ 실습문제 5번 ■■■■");
		System.out.print("이름 : ");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();

		System.out.print("학년(숫자만) : ");
		int hak1 = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int ban1 = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int bun1 = sc.nextInt();

		System.out.print("성별(M/F) : ");
		String gender1 = sc.next();

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double point1 = sc.nextDouble();

		if (gender1.equals("M")) {
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f 이다\n", hak1, ban1, bun1, name1, point1);
		} else if (gender1.equals("F")) {
			System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f 이다\n", hak1, ban1, bun1, name1, point1);

		}
	}

	public void yeansanja6() {
		/*
		 * 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요. ex.
		 * 나이 : 19 청소년
		 */

		System.out.println("■■■■ 실습문제 6번 ■■■■");

		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age1 = sc.nextInt();
		if (age1 < 14) {
			System.out.println("어린이");
		} else if (age1 > 13 && age1 < 20) {
			System.out.println("청소년");
		} else if (age1 > 19) {
			System.out.println("19세 초과");
		}
	}

	public void yeansanja7() {
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을
		 * 구하세요. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		 * 아니라면 불합격을 출력하세요. ex. 국어 : 60 영어 : 80 수학 : 40 합계 : 180 평균 : 60.0 합격
		 * 
		 */
		System.out.println("■■■■ 실습문제 7번 ■■■■");

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor1 = sc.nextInt();

		System.out.print("영어 : ");
		int eng1 = sc.nextInt();

		System.out.print("수학 : ");
		int math1 = sc.nextInt();

		int total1 = kor1 + eng1 + math1;
		double avg1 = total1 / 3;

		System.out.println("합계 : " + total1);
		System.out.println("평균 : " + (double) avg1);
		if (kor1 > 39 && eng1 > 39 && math1 > 39 && avg1 > 59) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

	public void yeansanja8() {
		System.out.println("■■■■ 실습문제 8번 ■■■■");

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(- 포합) : "); // 961201-1234567
		String socialNumber = sc.nextLine();

		if (socialNumber.length() >= 8) {
			char gender2 = socialNumber.charAt(7);

			if (gender2 == '2' || gender2 =='4') {
				System.out.println("여자");
			} else if (gender2 == '1' || gender2 == '3') {
				System.out.println("남자");
			}

		}

	}


	public void yeansanja9() {
		System.out.println("■■■■ 실습문제 9번 ■■■■");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		if( num1 >= num3 || num3 > num2 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

	public void yeansanja10() {
		System.out.println("■■■■ 실습문제 10번 ■■■■");

		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num4 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num5 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num6 = sc.nextInt();
		
		if(num4 == num5 || num5 == num6 ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

	public void yeansanja11() {
		System.out.println("■■■■ 실습문제 11번 ■■■■");

		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int year1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int year2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int year3 = sc.nextInt();
		
		double incen1 = 0.4;
		double incen2 = 0;
		double incen3 = 0.15;
		
		double ybong1 = year1 + (year1/incen1);
		double ybong2 = year2 + (year2/incen2);
		double ybong3 = year3 + (year3/incen3);

		if(ybong1 >= 3000 ) {
			System.out.printf("A사원의 연봉/연봉+a : %d/%d/n %d 이상", year1, ybong1, 3000 );
		}else if(ybong1 < 3000) {
			System.out.printf("A사원의 연봉/연봉+a : %d/%d/n %d 미만", year1, ybong1, 3000 );
		}
		
	}

}
