package com.javaex.practice;

import java.util.Scanner;

/* [Ex07.java]
숫자를 입력 받아 아래와 같이 출력하세요

*/
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int i = 1;
		int j;
		while (i <= num) {
			j = 1;
			while (j <= i) {
				System.out.print(i);
				++j;
			}
			System.out.println("");
			++i;
		}
		
		sc.close();
	}
}
