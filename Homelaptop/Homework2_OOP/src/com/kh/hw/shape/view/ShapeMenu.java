package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");

		// 3. 삼각형 ==> triangleMenu()
		// 4. 사각형 ==> squareMenu()
		// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복

	};

	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		// 1. 삼각형 면적 ==> inputSize()
		// 2. 삼각형 색칠 ==> inputSize()
		// 3. 삼각형 정보 ==> printInformation()
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		
	};

	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		// 1. 사각형 둘레 ==> inputSize()
		// 2. 사각형 면적 ==> inputSize()
		// 3. 사각형 색칠 ==> inputSize()
		// 4. 사각형 정보 ==> printInformation()
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
	};

	// 삼각형 메뉴, 사각형 메뉴의 세부 메뉴에서 모두 같은 메소드로 이동하기 때문에
	// 삼각형인지 사각형인지, 몇 번 메뉴인지 구분하기 위해 매개변수로 넘겨줌

	public void inputSize(int type, int menuNum) {
		// 매개변수로 들어온 type과 menuNum의 숫자에 따라 출력이 달라짐
		// int type이 ‘삼각형’이면서 menuNum이 1번일 경우
		// 높이 :
		// 너비 : 
		// 삼각형 면적 : ==> tc(TriangleController)의 calcArea() 출력
		// int type이 ‘삼각형’이면서 menuNum이 2번일 경우
		// 색깔을 입력하세요 :
		// tc의 paintColor() 호출 후 “색이 수정되었습니다” 출력
		// int type이 ‘사각형’이면서 menuNum이 1번이나 2번일 경우
		// 높이 :
		// 너비 : 
		// menuNum이 1번일 경우
		// 사각형 둘레 : ==> scr(SquareController)의 calcPerimeter() 출력
		// menuNum이 2번일 경우
		// 사각형 면적 : ==> scr의 calcArea() 출력
		// int type이 ‘사각형’이면서 menuNum이 3번일 경우
		// 색깔을 입력하세요 :
		// scr의 paintColor() 호출 후 “색이 수정되었습니다” 출력

		
	};

	public void printInformation(int type) {
		// int type에 따라 print()메소드를 불러오는 controller가 다름
		// int type이 ‘삼각형’일 경우 tc.print() 출력
		// int type이 ‘사각형’일 경우 scr.print() 출력
	};
	

}
