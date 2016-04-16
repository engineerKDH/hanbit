package syntex;

/**
 * 2016. 4. 16.
 * SumIf10.java
 * kdh@grit.co.kr
 * Story : for Loop + if Branch 를 결합한 수열의 합
 */
public class SumIf10 {

	public static void main(String[] args) {
		// 문제: for Loop과 syso 를 한번만써서 홀수합, 짝수합을 구하시오.
		int oddSum=0, evenSum=0;
		for (int i = 1; i <= 10; i++) {
			if (i%2 != 0) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println("홀수합은: "+oddSum+", "+"짝수합은: "+evenSum);
	}
}
