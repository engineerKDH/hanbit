package question;

import java.util.Scanner;

/**
 * @DATE : 2016. 4. 18.
 * @FILE : MoneyMain.java
 * @AUTH : 권동현 alcha@chol.com
 * @STORY : 화폐 문제
 */
public class MoneyMain {
	/**
	 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
	 * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
	 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
	 * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
	 * 표시하고 10원미만은 절삭
	   ****************************************************** 
	      요청금액 : 126520 원
        5만원 : 2매
        1만원 : 2매
        5천원 : 1매
        1천원 : 1매
        5백원 : 1개
	      백원 : 0개
	      오십원 : 0개
	      십원 : 2개
	   ********************************************************
	 * */
	public static void main(String[] args) {
		
		System.out.print("금액을 입력하세요: ");
		Scanner scan = new Scanner(System.in);

		int money = scan.nextInt();
		int mok = 0;
		int nmg = 0;

		MoneyAlgorithm moneyAlgorithm = new MoneyAlgorithm(money);
		
		System.out.println("******************************");
		System.out.println("요청금액: " + money+"원");
		System.out.println("5만원: " + moneyAlgorithm.moneyCount[0]+"매");
		System.out.println("1만원: " + moneyAlgorithm.moneyCount[1]+"매");
		System.out.println("5천원: " + moneyAlgorithm.moneyCount[2]+"매");
		System.out.println("1천원: " + moneyAlgorithm.moneyCount[3]+"매");
		System.out.println("5백원: " + moneyAlgorithm.moneyCount[4]+"매");
		System.out.println("백원: " + moneyAlgorithm.moneyCount[5]+"매");
		System.out.println("오십원: " + moneyAlgorithm.moneyCount[6]+"매");
		System.out.println("십원: " + moneyAlgorithm.moneyCount[7]+"매");
		System.out.println("******************************");
	}
}
