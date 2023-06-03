package com.kh.practice.snack.view;

import java.util.Scanner;
import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private static Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	public static void main(String[] args) {

		System.out.print("종류 : ");
		String kind = sc.next();

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("맛 : ");
		String flavor = sc.next();

		System.out.print("개수 : ");
		int numOf = sc.nextInt();

		System.out.print("가격 : ");
		int price = sc.nextInt();

		sc.nextLine();
		
		while (true) {
			System.out.println("저장 완료되었습니다.");
			System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
			char str = sc.nextLine().charAt(0);
				if (str =='n') {
					break;
				} else if(str == 'y') {
					
					System.out.println(kind + "(" + name + "-" + flavor + ")" + numOf + "개" + price + "원");
			}
		}
		System.out.println("종료");
	}

}
