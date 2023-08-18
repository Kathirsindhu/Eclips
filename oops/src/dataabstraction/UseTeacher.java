package dataabstraction;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		System.out.println(t1.age(1997));
		System.out.println(t1.name("vetri"));
		t1.gender();
	}
}
