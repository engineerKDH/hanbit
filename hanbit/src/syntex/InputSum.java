package syntex;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * InputSum.java
 * kdh@grit.co.kr
 * Story : 1부터 입력된 수까지의 합
 */
public class InputSum {

	public static void main(String[] args) {
		/***
		 * 문제 for-loop 로 입력한 값들의 합을 구하는 연산을 완성하시오
		 */
		System.out.println("[문제] 누적값 연산하는 문제입니다.");
		System.out.print("수를 입력하시오: ");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt(), sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		System.out.println("1부터 " + limit + "까지의 합 = " + sum);
	}
}
