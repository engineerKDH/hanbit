package kr.co.grit;

import java.util.Scanner;

/**
 * 2016. 4. 11.
 * MainClass.java
 * �ǵ��� (�Ѻ� ���� �ָ���)
 * Story: ���縵 ������ ���� �Է��ϱ�, 4���� �����, ù���ڴ� �빮�ڷ�...
 */
public class MainClass {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� '����' �Է�: ");
		String answer = scanner.next();
		String string = String.valueOf(Season.Autumn);
		if (answer.equals(string)) {
			System.out.println("�½��ϴ�.");
		} else {
			System.out.println("Ʋ���ϴ�.");
		}
	}
}

enum Season {
	Spring, Summer, Autumn, Winter
}