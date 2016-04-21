package homework;
/**
 * @DATE : 2016. 4. 16.
 * @FILE : SumIf10.java
 * @AUTH : pakjkwan@gmail.com
 * @STORY : for-loop + if-branch 수열의 합
 */
public class SumIf10 {
	public static void main(String[] args) {
		// 문제 : for-loop 과 syso 를 한번만 써서 홀수합, 짝수합을 구하시오
		int oddSum=0,evenSum=0;
		for (int i = 1; i <= 10; i++) {
			// 이 부분만 코딩하시오
			if(i%2!=0) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		System.out.println("홀수합은 "+oddSum+" 이고, 짝수합은 "+evenSum+"이다.");
	}
}
