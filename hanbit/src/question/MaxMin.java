package question;
/**
 * @DATE : 2016. 4. 16.
 * @FILE : MaxMin.java
 * @AUTH : pakjkwan@gmail.com
 * @STORY : 최대값 최소값 구하기 문제
 */
public class MaxMin {
	/**
	 * [결과] 최대값100 최소값:50
	 */
	public static void main(String[] args) {
		int sum = 0;
        float average = 0f;
        int[] score = { 100, 88, 95, 60, 77, 66, 90, 50 };
        int max = 0;
        int min = 0; 
        
        // for - loop 을 이용하여 알고리즘을 완성하시오
        max = score[0];
        for (int i = 0; i < score.length; i++) {
			if (score[i]>max) {
				max = score[i];
			}
		}
        min = score[0];
        for (int i = 0; i < score.length; i++) {
			if (score[i]<min) {
				min = score[i];
			}
		}

        System. out.println( "최대값: " + max );
        System. out.println( "최소값: " + min );
	}
}
