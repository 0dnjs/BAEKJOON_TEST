package baekjoon;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, AxB를 출력하는 프로그램을 작성하시오.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a * b);
	}

}
