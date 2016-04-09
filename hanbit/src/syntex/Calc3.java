package syntex;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Calc.java
 * kdh@grit.co.kr
 * Story : 브랜치 예제 (계산기 프로그램)
 */
public class Calc3 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		String op = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		a = scanner.nextInt();
		System.out.print("연산자 종류 입력(+, -, *, /) : ");
		op = scanner.next();
		System.out.print("두번째 정수 입력 : ");
		b = scanner.nextInt();

		if (op.equals("+")) {
			c = a + b;
			System.out.println(a + "+" + b + " = " + c);
		} else if (op.equals("-")) {
			c = a - b;
			System.out.println(a + "-" + b + " = " + c);
		} else if (op.equals("*")) {
			c = a * b;
			System.out.println(a + "*" + b + " = " + c);
		} else if (op.equals("/")) {
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + " = " + c + "..." + d);
		} else {
			System.out.println("연산기호를 잘못입력하였습니다.");
		}
	}
}
