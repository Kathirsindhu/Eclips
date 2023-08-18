package oops2;

public class UseLoan {
	public static void main(String[] args) {
		Loan l = new Loan();
		System.out
				.println(l.checkEligible() + " \n" + l.checkEligible(25000) + "\n " + l.checkEligible(25000, 1000000));
	}
}
