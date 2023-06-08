package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	Scanner sc = new Scanner(System.in);

	public void upDown() {
//		1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데
//		몇 번 만에 맞췄는지 출력하세요.
		int count = 0;

		Random random = new Random();
		int nansu = random.nextInt(101);
		System.out.println(nansu);

		while (true) {

			System.out.println("1~100사이의 임의의 난수를 맞춰보세요 : ");
			int nansu1 = sc.nextInt();

			if (nansu1 > 100 || nansu1 < 1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			} else if (nansu1 < 101 || nansu1 > 0) {
				if (nansu1 > nansu) {
					System.out.println("DOWN !");
					count++;
				} else if (nansu1 < nansu) {
					System.out.println("UP !");
					count++;
				} else if (nansu1 == nansu) {
					System.out.println("정답입니다 !!");
					count++;
					System.out.println(count + "회만에 맞추셨습니다.");
					break;
				} else {
					System.out.println("1~100 사이의 숫자를 입력해주세요.");
					System.out.print("1~100사이의 임의의 난수를 맞춰보세요 : ");
					nansu1 = sc.nextInt();
				}
			}
		}	
	}
}
