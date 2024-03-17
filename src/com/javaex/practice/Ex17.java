package com.javaex.practice;

import java.util.Scanner;
/* [Ex17.java]
숫자 하나를 입력 받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
*/
public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = num; i > 0; i--) {
			for ( int j = i; j > 0; j--) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
