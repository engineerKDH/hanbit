package kr.co.grit;

import java.util.Scanner;

/**
 * 2016. 4. 11.
 * MainClass.java
 * Story: �����ϴ� ��, ������ �� �Է��ϸ� �� ���� �����ִ� ���α׷�
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° �� �Է�: ");
		int num1 = scanner.nextInt();
		System.out.print("�ι�° �� �Է�: ");
		int num2 = scanner.nextInt();
		
		System.out.println(summation(num1, num2));
	}
	
	static String summation(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += num1;
		}
		return Integer.toString(sum);
	}
}
