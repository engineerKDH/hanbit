package syntex;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Divide.java
 * kdh@grit.co.kr
 * Story : 나눗셈 문법 
 */
public class Divide {

	public static void main(String[] args) {
		int a=0, b=0, c=0, d=0;
		System.out.println("=== 나눗셈 문법 ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		a = scanner.nextInt();
		System.out.println("첫번째 정수 입력 : ");
		b = scanner.nextInt();
		
		c = a / b;
		d = a % b;
		
		System.out.println("=== 결과값 ===");
		System.out.println(a+"/"+b+" = "+c+"..."+d);
	}
}
