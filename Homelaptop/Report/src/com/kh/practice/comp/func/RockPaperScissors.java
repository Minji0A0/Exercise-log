package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	private Scanner sc = new Scanner(System.in);
	private String randomRule;

	String rule1 = "가위";
	String rule2 = "바위";
	String rule3 = "보";

	private Random random = new Random();
	private boolean exit;
	int count = 0;
	int wins = 0;
	int ties = 0;
	int losses = 0;

	public void rps() {
//		사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
//		랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
//		사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
//		몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();

		while (true) {

			System.out.println("");
			System.out.print("가위바위보 : ");
			String game = sc.next();
			
			if (game.equals("exit")) {
				System.out.println(count + "전 " + wins + "승 " + ties + "무 " + losses + "패");
				break;
			}

			int randomNumber = random.nextInt(3);
			if (randomNumber == 0) {
				randomRule = rule1;
			} else if (randomNumber == 1) {
				randomRule = rule2;
			} else if (randomNumber == 2) {
				randomRule = rule3;
			}

			String result = null;

			switch (game) {
			case "가위":
				if (rule2.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule2);
					System.out.println(name + " : " + game);
					System.out.println("졌습니다 ㅠㅠ");
					count++;
					losses++;
					break;
				} else if (rule3.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule3);
					System.out.println(name + " : " + game);
					System.out.println("이겼습니다 !");
					count++;
					wins++;
					break;
				} else if (rule1.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule1);
					System.out.println(name + " : " + game);
					System.out.println("비겼습니다.");
					count++;
					ties++;
					break;
				}

			case "바위":
				if (rule3.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule3);
					System.out.println(name + " : " + game);
					System.out.println("졌습니다 ㅠㅠ");
					count++;
					losses++;
					break;
				} else if (rule1.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule1);
					System.out.println(name + " : " + game);
					System.out.println("이겼습니다 !");
					count++;
					wins++;
					break;
				} else if (rule2.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule2);
					System.out.println(name + " : " + game);
					System.out.println("비겼습니다.");
					count++;
					ties++;
					break;
				}

			case "보":
				if (rule1.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule1);
					System.out.println(name + " : " + game);
					System.out.println("졌습니다 ㅠㅠ");
					count++;
					losses++;
					break;
				} else if (rule2.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule2);
					System.out.println(name + " : " + game);
					System.out.println("이겼습니다 !");
					count++;
					wins++;
					break;
				} else if (rule3.equals(randomRule)) {
					System.out.println("컴퓨터 : " + rule3);
					System.out.println(name + " : " + game);
					System.out.println("비겼습니다.");
					count++;
					ties++;
					break;
				}

				
			default:
				break;
			}
		}
	}
}
