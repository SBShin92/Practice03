package com.javaex.practice;
/* [Ex08.java]
아래와 같이 구구단을 출력하세요

*/
public class Ex08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			
			System.out.println("");
		}
	}
}
