package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void unicode() {
	
/*		Class Name : com.kh.practice2.func.CastingPractice1
		실행 클래스 : com.kh.practice2.run.Run
		키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		ex.
		문자 : A
		A unicode : 65
*/		

	
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String input = sc.next();
		char munja1 = input.charAt(0);
		int unicode = (int) munja1;
				
		System.out.println(munja1+" unicode : "+unicode);
		
		
	
	}

}
