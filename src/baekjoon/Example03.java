package baekjoon;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A - B를 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a - b);
	}
	
}