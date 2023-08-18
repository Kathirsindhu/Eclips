package oops2;

public class Bank {
	String branch;
	long accNum;

	public int findRateOfInterest(int price) {
		return price + (price * 5 / 100);
	}

	public String loanEligible(String branch) {
		if (branch.equals("chennai")) {
			return "Eligible";
		} else {
			return "Not eligible";
		}
	}
}
