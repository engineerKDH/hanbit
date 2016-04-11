package kr.co.grit;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.print("아무 글자나 넣으세요: ");
		String str = readString();
		char[] charStr = str.toCharArray();
		int count = charStr.length;
		System.out.println("글자 수: "+count);
	}
	
	static private String readString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
}
