package kr.co.grit;

import java.util.Scanner;

/**
 * 2016. 4. 11. 
 * MainClass.java 
 * 권동현 (한빛 신촌 주말반) 
 * Story: 윤년 판단하는 방법
 */
public class MainClass {

	public static void main(String[] args) {
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력: ");
		year = scanner.nextInt();
		
		// 짝수 홀수 구별은 2로 나누어 떨어지면 짝수 아니면 홀수 이다. 
		
		// 4로 나누어 떨어지는 해 중, 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어진다면 윤년이다.
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}
