package day4;

public class UseStudent {
	public static void main(String[] arg) {
		Student s1 = new Student();
		String[] a = arg[0].split("-");
		s1.name = a[0];
		s1.mark = Integer.parseInt(a[1]);
		s1.isPass = Boolean.parseBoolean(a[2]);
		Student s2 = new Student();
		String[] b = arg[1].split("-");
		s2.name = b[0];
		s2.mark = Integer.parseInt(b[1]);
		s2.isPass = Boolean.parseBoolean(b[2]);
		System.out.println("Student name is " + s1.name);
		System.out.println("Student name is " + s2.name);
		System.out.println("Student mark is " + s1.mark);
		System.out.println("Student mark is " + s2.mark);

	}

}
