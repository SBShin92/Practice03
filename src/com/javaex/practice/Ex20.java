package com.javaex.practice;

import java.util.Random;
import java.util.Scanner;

/* [Ex20.java]
아래와 설명에 맞는 프로그램을 작성하세요
숨겨진 숫자를 맞추는 게임입니다.
프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
정답을 맞춘 경우 “맞았습니다.” 출력됩니다.
게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
(y 인 경우 다시 게임이 시작됩니다.)
*개발시 랜덤하게 생성된 값을 출력해서 테스트 하면 편리합니다.
*/

public class Ex20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int val = (random.nextInt() % 100 + 1);
		if (val < 0)
			val *= -1;
		
		System.out.println("===============================");
		System.out.println("       [숫자맞추기게임 시작]");
		System.out.println("===============================");
		
		boolean flag = true;
		int tmp = 0;
		
		while (flag) {
			System.out.print(">>");
			tmp = sc.nextInt();
			if (tmp > val)
				System.out.println("더 낮게");
			else if (tmp < val)
				System.out.println("더 높게");
			else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				sc.nextLine();
				String exitQuestion = sc.nextLine();
				if (exitQuestion.equals("y") || exitQuestion.equals("Y")) {
					val = (random.nextInt() % 100 + 1);
					if (val < 0)
						val *= -1;
				}
				else if (exitQuestion.equals("n") || exitQuestion.equals("N"))
					flag = false;

			}
			
		}
		sc.close();
	}
}
