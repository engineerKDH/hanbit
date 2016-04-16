package main_test;

import java.util.Scanner;

public class Calculator {

	public String execute(int a, String op, int b) {
		String result = "";
		switch (op) {
		case "+":
			result = a + "+" + b + " = " + (a + b);
			break;
		case "-":
			result = a + "-" + b + " = " + (a - b);
			break;
		case "*":
			result = a + "*" + b + " = " + (a * b);
			break;
		case "/":
			result = a + "/" + b + " = " + (a / b) + "..." + (a % b);
			break;
		default:
			result = "연산기호를 잘못입력하였습니다.";
			break;
		}
		return result;
	}
}
