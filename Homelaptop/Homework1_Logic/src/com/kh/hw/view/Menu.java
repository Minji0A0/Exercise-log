package com.kh.hw.view;

import java.util.Scanner;
import com.kh.hw.controller.Function;

public class Menu {
//	Run에서 Menu 사용, Menu에서 Function 사용
//	Run클래스에 main()를 구현하여 main()메소드에는 Menu클래스의 displayMenu()메소드 실행

	private Scanner sc = new Scanner(System.in);
	private int menunum;

	public void displayMenu() {
		Function func = new Function();
//		메소드 명 : public void displayMenu(){}
//		1. displayMenu() 메소드에 메뉴 화면이 반복 출력되게 함
//		2. 메뉴 번호를 입력 받아 해당 번호의 기능이 실행되게 함
//		3. 메뉴 1~8번까지의 실행용 메소드는 Function클래스의 메소드 호출
//		4. 9번 입력 시 “종료합니다.” 출력 후 종료
//		5. 잘 못 입력 했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력

		do {
			System.out.println("");
			System.out.println("===== Menu =====");
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			this.menunum = sc.nextInt();
			System.out.println("");

			if (this.menunum < 1 || 9 < this.menunum) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} else {

				switch (this.menunum) {
				case 1:
					Function.kandangyesangi();

					break;
				case 2:
					Function.hapgye();

					break;
				case 3:
					Function.sinsang();

					break;
				case 4:
					Function.studentinfo();

					break;
				case 5:
					Function.startosuji();

					break;
				case 6:
					Function.nansu();

					break;
				case 7:
					Function.gugudan();

					break;
				case 8:
					Function.dicesuji();

					break;
					
				case 9:
					System.out.println("종료");
					break;
					
				default:
					System.out.println("!!!메뉴에 해당하는 1-9 숫자만 작성해주세요.");
					continue;
				}
			}
		} while (this.menunum !=9 );
	}
}