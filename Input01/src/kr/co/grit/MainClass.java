package kr.co.grit;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.print("�ƹ� ���ڳ� ��������: ");
		String str = readString();
		char[] charStr = str.toCharArray();
		int count = charStr.length;
		System.out.println("���� ��: "+count);
	}
	
	static private String readString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
}
