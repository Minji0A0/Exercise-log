package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	/*
	Class Name : com.kh.practice2.func.CastingPractice2
	실행 클래스 : com.kh.practice2.run.Run
	실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	이 때 총점과 평균은 정수형으로 처리하세요.
	ex.
	국어 : 90.0
	영어 : 90.0
	수학 : 90.0
	총점 : 270
	평균 : 9
	*/
	public void point() {

		System.out.print("국어 : ");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		Scanner sc1 = new Scanner(System.in);
		int eng = sc1.nextInt();

		System.out.print("수학 : ");
		Scanner sc2 = new Scanner(System.in);
		int math = sc2.nextInt();
		

		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + (kor+eng+math)/3);
	}
}
