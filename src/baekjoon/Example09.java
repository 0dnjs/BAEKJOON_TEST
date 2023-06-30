package baekjoon;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		/*
		 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		 * (AxB)%C는 ((A%C) x (B%C))%C 와 같을까?
		 * 세 수 A,B,C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

}
