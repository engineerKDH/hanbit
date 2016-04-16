package syntex;

/**
 * 2016. 4. 16. ContinueEx.java kdh@grit.co.kr Story : 명령문 (return, break,
 * continue) 연습
 */
public class ContinueEx {
	/**
	 * 1부터 10까지의 정수 중에서, 3의 배수를 제외한 수를 출력하시오.
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue; // 조건이 맞으면 아래로 진행하지 말고, 다시 처음에서 시작해라.
			}
			System.out.println(i);
		}
	}
}
