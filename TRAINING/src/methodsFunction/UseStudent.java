package methodsFunction;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.tamil = 98;
		s1.eng = 99;
		s1.math = 100;
		s1.total = s1.total();
		s1.display();
		Student s2 = new Student();
		s2.tamil = 100;
		s2.eng = 100;
		s2.math = 100;
		s2.total = s2.total();
		s2.display();
	}
}
