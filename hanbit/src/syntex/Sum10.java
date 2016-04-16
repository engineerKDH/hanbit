package syntex;

/**
 * 2016. 4. 16.
 * Sum10.java
 * kdh@grit.co.kr
 * Story : 1부터 10까지의 합
 */
public class Sum10 {

	public static void main(String[] args) {
		int sum=0;
		
		for (int i = 1; i <= 10; i+=2) {
			sum += i;
//			System.out.print(i+"\t");
		}
		System.out.println("홀수의 합: "+sum);
		
		sum=0;
		
		for (int i = 2; i <= 10; i+=2) {
			sum += i;
//			System.out.print(i+"\t");
		}
		System.out.println("짝수의 합: "+sum);
	}
}
