package homework;

import java.util.Scanner;

/**
 * @file   : KaupMain.java 
 * @author : alcha@chol.com
 * @date   : 2016. 2. 21.
 * @story  : 카우프지수
 */
public class KaupMain {
	/**
	 * To. 개발자님
	 * 사람의 이름을 입력하고, 몸무게 , 키를 입력하면
	 * 해당 사람의 상태가 비만인지 저체중인지 알려주는 
	 * 카우프 프로그램을 만들어주세요.
	 * 카우프 지수 구하는 공식은 몸무게를 키의제곱으로 나눈 후
	 * int idx = (int)(weight/(height*height))*10000
	 * 10000을 곱한 인덱스값이 랍니다.
	 * 
	 * 그 인덱스결과가 30 이상이면 비만
	 * 24 이상이면 과체중
	 * 20 이상이면 정상
	 * 15 이상이면 저체중
	 * 13 이상이면 마름
	 * 10 이상이면 영양실조
	 * 그 미만이면 소모증 이랍니다.
	 * 
	 * 어플리케이션 제작 바랍니다.
	 */
	public static void main(String[] args) {
		
		/* 변수 선언 */
		Scanner scanner = new Scanner(System.in);  
		Kaup kaup = new Kaup();
		String name = "";  
		double height = 0.0, weight = 0.0;
		
		/* 데이터 입력 */
		System.out.println("*** 이름,키,몸무게 입력를 입력합니다. ***");
		System.out.print("이름 입력: ");
		name = scanner.next();
		System.out.print("신장(키) 입력: ");
		height = scanner.nextDouble();
		System.out.print("몸무게 입력: ");
		weight = scanner.nextDouble();
		
		/* 연산 */
		String result = kaup.getResult(height, weight);
		
		/* 결과 출력 */
		System.out.println("*** 결과값 ***");
		System.out.println(name+" "+height+" "+weight);
		System.out.println(name+"님의 상태는 "+result+" 입니다.");
	}
}
