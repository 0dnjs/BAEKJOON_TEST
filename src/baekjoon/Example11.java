package baekjoon;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		/*
		 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int sum = a + b + c;
		
		System.out.println(sum);
	}

}
