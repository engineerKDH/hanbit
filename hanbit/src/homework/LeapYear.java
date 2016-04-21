package homework;

public class LeapYear {
	public String getEndOfMonth(int year,int month){
		String day="";
		// 코딩하여 완성하시오
		if((year%4)==0 && (year%100)!=0 || (year%400)==0) {
			switch (month) {
			case 1: day = "31"; break;
			case 2: day = "29"; break;
			case 3: day = "31"; break;
			case 4: day = "30"; break;
			case 5: day = "31"; break;
			case 6: day = "30"; break;
			case 7: day = "31"; break;
			case 8: day = "31"; break;
			case 9: day = "30"; break;
			case 10: day = "31"; break;
			case 11: day = "30"; break;
			case 12: day = "31"; break;
			default: day = " : [오류] 1월~12월까지만 됩니다."; break;
			}
		}else {
			switch (month) {
			case 1: day = "31"; break;
			case 2: day = "28"; break;
			case 3: day = "31"; break;
			case 4: day = "30"; break;
			case 5: day = "31"; break;
			case 6: day = "30"; break;
			case 7: day = "31"; break;
			case 8: day = "31"; break;
			case 9: day = "30"; break;
			case 10: day = "31"; break;
			case 11: day = "30"; break;
			case 12: day = "31"; break;
			default: day = " : [오류] 1월~12월까지만 됩니다."; break;
			}
		}
		return year+"-"+month+"-"+day;
	}
}
