package oops2;

public class UseBank {
	public static void main(String[] args) {
		CubBank c1 = new CubBank();
		c1.accNum = 123456789987l;
		c1.branch = "perungudi";
		System.out.println(
				c1.accNum + " " + c1.branch + " " + c1.findRateOfInterest(20000) + " " + c1.loanEligible(c1.branch));
		Bank b1 = new Bank();
		System.out.println(b1.findRateOfInterest(20000));

	}
}
