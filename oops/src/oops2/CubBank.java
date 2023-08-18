package oops2;

public class CubBank extends Bank {
	public int findRateOfInterest(int price) {
		return price + (price * 10 / 100);
	}

	public String loanEligible(String branch) {
		if (branch.equals("perungudi")) {
			return "Eligible";

		} else {
			return "Not Eligible";
		}
	}
}
