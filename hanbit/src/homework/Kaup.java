package homework;

public class Kaup {

	public String getResult(double height, double weight) {
		String result = "";
		// 코드를 완성하시오
		int idx = (int) (weight / (height * height)) * 10000;
		if (idx >= 30) {
			result = "비만";
		} else if (idx >= 24) {
			result = "과체중";
		} else if (idx >= 20) {
			result = "정상";
		} else if (idx >= 15) {
			result = "저체중";
		} else if (idx >= 13) {
			result = "마름";
		} else if (idx >= 10) {
			result = "영양실종";
		} else {
			result = "소모증";
		}
		return result;
	}
}
