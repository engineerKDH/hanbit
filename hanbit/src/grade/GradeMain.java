package grade;

import java.util.Scanner;

public class GradeMain {
	/**
	 * 과목별 점수를 입력하여, 학점을 구하는 프로그램
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = new Grade();
		int total = 0;
		String name = "";

		System.out.println("이름, 국어점수, 영어점수, 수학점수를 각각 입력: ");
		name = scanner.next();
		total = grade.getTotal(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		
		
		System.out.println(name + "님의 총점은 " + total + " 점이고, 평균은 " + grade.getAvg(total) + " 점이다.");
	}
}
