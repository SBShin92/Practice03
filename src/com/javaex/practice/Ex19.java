package com.javaex.practice;

import java.util.Scanner;

/* [Ex19.java]
아래와 같이 은행 프로그램을 작성하세요
“1.예금” 선택 후 금액을 입력하면 예금액이 합산됩니다.
“2.출급” 선택 후 금액을 입력하면 예금액이 차감됩니다.
“3.잔고” 선택 시 현재 잔고가 출력됩니다.
“4.종료” 선택 시 종료됩니다.
“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다

*/
public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int money = 0;
		int tmp = 0;
		
		boolean flag = true;
		while (flag) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				System.out.println("예금액>");
				tmp = sc.nextInt();
				money += tmp;
				break ;
			}
			case 2: {
				System.out.println("출금액>");
				tmp = sc.nextInt();
				money -= tmp;
				break ;
			}
			case 3: {
				System.out.println("잔고액>" + money);
				break ;
			}
			case 4: {
				System.out.println("프로그램 종료");
				flag = false ;
				break ;
			}
			default:
				System.out.println("다시입력해주세요");
				break ;
			}
		}
		
		sc.close();
	}
}
