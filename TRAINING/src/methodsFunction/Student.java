package methodsFunction;

public class Student {
	int tamil;
	int eng;
	int math;
	int total;

	public int total() {
		return tamil + eng + math;
	}

	public void display() {
		System.out.println(tamil + " " + eng + " " + math + " " + total);
	}
}
