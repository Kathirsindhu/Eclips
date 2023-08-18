package methodsFunction;

public class VoterAge {
	int age;

	public String age() {
		if (age >= 18) {
			return "Eligible";

		} else {
			return "Not Eligible";
		}
	}
}
