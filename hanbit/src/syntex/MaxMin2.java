package syntex;

import java.util.Scanner;

public class MaxMin2 {

	public static void main(String[] args) {
		System.out.println("*** 점수를 입력하면 최고점, 최저점이 출력됩니다.(만점은 100, 0점은 0 ***");
		System.out.println("총 다섯명의 점수만 입력이 가능, 입력해 주세요.");

		int max = 0, min = 100;
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번째 점수입력: ");
			scores[i] = scanner.nextInt();
		}

		// for (int i = 0; i < scores.length; i++) {
		// System.out.print(scores[i] + "점 ");
		// }

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= max) {
				max = scores[i];
			}
			if (scores[i] <= min) {
				min = scores[i];
			}
		}

		System.out.println("최고점= " + max + ", 최저점= " + min);
	}
}
