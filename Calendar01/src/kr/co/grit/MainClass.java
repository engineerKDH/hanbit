package kr.co.grit;

import java.util.Scanner;

/**
 * 2016. 4. 11. 
 * MainClass.java 
 * �ǵ��� (�Ѻ� ���� �ָ���) 
 * Story: ���� �Ǵ��ϴ� ���
 */
public class MainClass {

	public static void main(String[] args) {
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�⵵�� �Է�: ");
		year = scanner.nextInt();
		
		// ¦�� Ȧ�� ������ 2�� ������ �������� ¦�� �ƴϸ� Ȧ�� �̴�. 
		
		// 4�� ������ �������� �� ��, 100���� ������ �������� �ʰų� 400���� ������ �������ٸ� �����̴�.
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
}
