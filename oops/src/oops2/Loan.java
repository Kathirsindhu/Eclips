package oops2;

public class Loan {
	public int checkEligible() {
		return 30000;
	}

	public int checkEligible(int salary) {

		return 30000 + (salary * 5);
	}

	public int checkEligible(int salary, int property) {
		return 30000 + (salary * 5) + (property * 10);
	}
}
