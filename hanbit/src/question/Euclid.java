package question;

import java.util.Scanner;

/**
 * 2016. 4. 18. 
 * Euclid.java 
 * alcha@chol.com 
 * Story : 최대공약수, 최소공배수 구하기 문제
 */
public class Euclid {
	/**
	 * [문제] 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 계산해서 출력하는 순서도를 작성하시오 [유클리드 호제법] 2개의 자연수
	 * 또는 정식(整式)의 최대공약수를 구하는 알고리즘의 하나 호제법이란 말은 두 수가 서로(互) 상대방 수를 나누어(除)서 결국 원하는
	 * 수를 얻는 알고리즘을 나타낸다. 예를 들어 1071과 1029의 최대공약수를 구하면, 1071은 1029로 나누어 떨어지지 않기
	 * 때문에, 1071을 1029로 나눈 나머지를 구한다. => 42 1029는 42로 나누어 떨어지지 않기 때문에, 1029를 42로
	 * 나눈 나머지를 구한다. => 21 42는 21로 나누어 떨어진다. 따라서, 최대공약수는 21이다.
	 * 
	 * 다른 예는 15와 12의 최대공약수/최소공배수 구하는 것이다. 두 수 중 큰 수를 결정하여 큰 수를 작은 수로 나눈다. 15/12
	 * -> mok 1 nmg 3 nmg 가 0 이 아니므로 작은 수를 큰 수로 하고, nmg 를 작은 수로 하여 다시 나눈다. 12/3
	 * -> mok 4 nmg 0 nmg 가 0 이므로 이때 작은 수인 3인 최대공약수 이다. 원래의 두수를 곱한 후 최대공약수로 나누어
	 * 최소공배수를 구한다. 3 -> 최대공약수 (12*15)/3 = 60 -> 최소공배수 [변수] a, b : 입력받는 두 수 big,
	 * samll : 입력받은 두 수를 큰수,작은수로 구분 mok, nmg : 몫과 나머지 gcd : 최대공약수 greatest
	 * common denominator ldm : 최소공배수 least common multiple [결과] 최대공약수, 최소공배수를
	 * 구하는 두 수 입력 15 12 최대공약수 3 최소공배수 60
	 */
	public static void main(String[] args) {
		int a, b, big, small = 0, mok = 0, nmg = 0, gcd = 0, lcm = 0;

		System.out.println("최대공약수, 최소공배수를 구하는 두 수 입력 ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		b = sc.nextInt();

		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}

		while (big % small != 0) {
			// 이 부분을 코딩하여 완성하시오
			mok = big % small;
		    big = small;
		    small = mok;
		}
		if (big % small == 0) {
			gcd = nmg;
			lcm = (a * b) / gcd;
			System.out.println("최대공약수 = " + gcd);
			System.out.println("최소공배수 = " + lcm);
		}
	}
}
