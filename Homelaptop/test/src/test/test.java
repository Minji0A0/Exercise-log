package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			String str = sc.nextLine();
			list.add(str);
		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < num; i++) {
					System.out.print((list.size() + 1) + "번째 문자열 : ");
					String str = sc.nextLine();
					list.add(str);
				}
			} else {
				break;
			}
		}
		System.out.println(list);
	}
}
