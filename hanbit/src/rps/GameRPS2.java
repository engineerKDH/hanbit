package rps;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * 2016. 4. 16. RPS.java kdh@grit.co.kr Story : 가위 바위 보 게임
 */
public class GameRPS2 {
	/**
	 * 컴퓨터와 사용자 간의 가위바위보 게임을 완성하시오. Math.random()*E+S (S는 시작값, E는 마지막값)
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("*** 가위바위보 게임 ***");
		System.out.println("가위:1, 바위:2, 보:3");
		System.out.print("숫자를 입력하세요: ");
		
		// --------------------[가공하는 데이터를 입력하는 부분]----------------------
		int sccisors = 1, rock = 2, paper = 3, rpsValue = 0, comValue = 0;
		String result = "";
		rpsValue = scanner.nextInt();
		comValue = (int) (Math.random() * 3 + 1);

		switch (rpsValue) {
		case 1:
			if (comValue == 1) {
				result = "사용자 가위, 컴퓨터 가위, 무승부!";
			} else if (comValue == 2) {
				result = "사용자 가위, 컴퓨터 바위, 패배!";
			} else {
				result = "사용자 가위, 컴퓨터 보, 승리!";
			}
			break;
		case 2:
			if (comValue == 2) {
				result = "사용자 바위, 컴퓨터 가위, 무승부!";
			} else if (comValue == 3) {
				result = "사용자 바위, 컴퓨터 바위, 패배!";
			} else {
				result = "사용자 바위, 컴퓨터 보, 승리!";
			}
			break;
		case 3:
			if (comValue == 3) {
				result = "사용자 보, 컴퓨터 가위, 무승부!";
			} else if (comValue == 1) {
				result = "사용자 보, 컴퓨터 가위, 패배!";
			} else {
				result = "사용자 보, 컴퓨터 바위, 승리!";
			}
			break;
		default:
			result = "1~3까지만 입력 가능합니다!";
			break;
		}

		// ............[결과가 보여지는 부분]..........
		System.out.println("*** 결과값 ***\n" + result);
	}
}
