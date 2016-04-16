package main_test;

import java.util.Scanner;

import grade.Grade;

public class CalcMain {

	public static void main(String[] args) {
		int a = 0, b = 0;
		String op = "", result="";
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		a = scanner.nextInt();
		System.out.print("연산자 종류 입력(+, -, *, /) : ");
		op = scanner.next();
		System.out.print("두번째 정수 입력 : ");
		b = scanner.nextInt();
		
		Calculator calculator = new Calculator();
		result = calculator.execute(a, op, b);
		
		System.out.println(result);
	}
}
