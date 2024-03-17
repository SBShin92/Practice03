package com.javaex.practice;

import java.util.Scanner;

/* [Ex14.java]
13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.

*/
public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int val = 0;
		if (num > 0)
			System.out.print("1");
		for ( int i = 1; i <= num; i++) {
			System.out.print("+" + i);
			val += i;
		}
		System.out.println("");
	
		System.out.println("결과값: " + val);
		
		sc.close();
	}
}
