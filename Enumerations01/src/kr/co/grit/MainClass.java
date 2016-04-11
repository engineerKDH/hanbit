package kr.co.grit;

import java.util.Scanner;

/**
 * 2016. 4. 11.
 * MainClass.java
 * 권동현 (한빛 신촌 주말반)
 * Story: 스펠링 맞을때 까지 입력하기, 4계절 영어로, 첫글자는 대문자로...
 */
public class MainClass {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("영어로 '가을' 입력: ");
		String answer = scanner.next();
		String string = String.valueOf(Season.Autumn);
		if (answer.equals(string)) {
			System.out.println("맞습니다.");
		} else {
			System.out.println("틀립니다.");
		}
	}
}

enum Season {
	Spring, Summer, Autumn, Winter
}