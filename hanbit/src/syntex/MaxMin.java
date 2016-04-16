package syntex;

import java.util.Scanner;

/**
 * 2016. 4. 16. 
 * MaxMin.java 
 * kdh@grit.co.kr 
 * Story : 배열 + for Loop
 */
public class MaxMin {
	/**
	 * [문제] 한반에 다섯명의 학생이 시험을 치렀다.
	 * 선생님이 다섯명의 점수를 입력하자마자 바로, 최고점과 최저점이 출력되는 프로그램을 완성하라.
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("*** 점수를 입력하면 최고점, 최저점이 출력됩니다. ***");
		System.out.println("총 다섯명의 점수만 입력이 가능, 입력해 주세요.");
		
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[3];
		
		System.out.print("첫번째 점수입력: ");
		scores[0] = scanner.nextInt();
		System.out.print("두번째 점수입력: ");
		scores[1] = scanner.nextInt();
		System.out.print("세번째 점수입력: ");
		scores[2] = scanner.nextInt();
		
		if (scores[0] > scores[1] && scores[0] > scores[2]) {
			max = scores[0];
		} else if (scores[1] > scores[2]) {
			max = scores[1];
		} else {
			max = scores[2];
		}
		
		System.out.println("최고점은 : "+max+"점 입니다.");
	}
}
