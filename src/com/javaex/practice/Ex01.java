package com.javaex.practice;
/*[Ex01.java]
아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.)


정답 :
index : 0, 1, 2
order : 0, 1, 2

*/
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("while문");
		int index = 0;
		while (index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		
		System.out.println("for문");
		for (int order = 0; order < 3; order++) {
			System.out.println("order=" + order);
		}
	}
}
