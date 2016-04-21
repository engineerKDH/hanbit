package question;

public class MoneyAlgorithm {

	int money;
	int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	int[] moneyCount = new int[8];

	public MoneyAlgorithm(int money) {
		this.money = money;
		execute();
	}

	private void execute() {
		for (int i = 0; i < moneyUnit.length; i++) {
			// 이 부분을 코딩하여 완성하시오
			if (money >= moneyUnit[0]) {
				moneyCount[0] = money / moneyUnit[0];
				money = money % moneyUnit[0];
			} else if (money >= moneyUnit[1]) {
				moneyCount[1] = money / moneyUnit[1];
				money = money % moneyUnit[1];
			} else if (money >= moneyUnit[2]) {
				moneyCount[2] = money / moneyUnit[2];
				money = money % moneyUnit[2];
			} else if (money >= moneyUnit[3]) {
				moneyCount[3] = money / moneyUnit[3];
				money = money % moneyUnit[3];
			} else if (money >= moneyUnit[4]) {
				moneyCount[4] = money / moneyUnit[4];
				money = money % moneyUnit[4];
			} else if (money >= moneyUnit[5]) {
				moneyCount[5] = money / moneyUnit[5];
				money = money % moneyUnit[5];
			} else if (money >= moneyUnit[6]) {
				moneyCount[6] = money / moneyUnit[6];
				money = money % moneyUnit[6];
			} else if (money >= moneyUnit[7]) {
				moneyCount[7] = money / moneyUnit[7];
				money = money % moneyUnit[7];
			}
		}
	}
}
