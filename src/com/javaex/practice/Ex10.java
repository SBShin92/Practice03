package com.javaex.practice;

import java.util.Scanner;

/* [Ex10.java]
정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
*/
public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			int n = sc.nextInt();
			if (max <= n)
				max = n;
		}
		System.out.println("최대값은 " + max + " 입니다.");
		
		sc.close();
	}
	
}
