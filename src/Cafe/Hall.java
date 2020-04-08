package Cafe;

public class Hall {

	public static void main(String[] args) {
		cafeFinance cafe1 = new cafeFinance(1000000000, 1000000000, 1000000000, 1000000000, "1,000,000,000");
		Menu americano = new Menu("americano", 4500, "americano");
		Menu cafemoka = new Menu("cagemoka", 4000, "cafemoka");
		Menu honeybread = new Menu("honeybread", 6000, "honeybread");
		Employee chulsukim = new Employee("±èÃ¶¼ö", 24, "incheon", 2300000, "2,300,000");
		Employee eunheahong = new Employee("È«ÀºÇý", 23, "gyunggido", 2300000, "2,300,000");
		

		chulsukim.payCheck(chulsukim, cafe1);
		cafe1.cafebalance(cafe1);
		eunheahong.payCheck(eunheahong, cafe1);
		cafe1.cafebalance(cafe1);
	}
}
