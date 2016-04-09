package syntex;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Minus.java
 * kdh@grit.co.kr
 * Story : 뺄셈 계산 프로그램
 */
public class Minus {

	public static void main(String[] args) {
		System.out.println("=== 정수 뺄셈 ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력 : ");
		int a = scanner.nextInt();
		System.out.println("두번째 정수를 입력 : ");
		int b = scanner.nextInt();
		
		int sum = a - b;
		System.out.println("=== 결과값 ===");
		System.out.println(a+"-"+b+" = "+sum);
	}
}
