package day2;

public class StudentOne {
	public static void main(String[] arg) {
		Student s1 = new Student();
		s1.name = "kathir";
		s1.id = 1190;
		s1.age = 18;
		s1.mobile = 1234567890l;
		s1.isboy = true;
		System.out.println(s1.name + " " + s1.id + " " + s1.age + " " + s1.mobile + " " + s1.isboy);
		Student s2 = new Student();
		s2.name = "vetri";
		s2.id = 1100;
		s2.age = 18;
		s2.mobile = 7894561230l;
		s2.isboy = true;
		System.out.println(s2.name + " " + s2.id + " " + s2.age + " " + s2.mobile + " " + s2.isboy);
		Student s3 = new Student();
		s3.name = "karthi";
		s3.id = 1000;
		s3.age = 18;
		s3.mobile = 1234567890l;
		s3.isboy = true;
		System.out.println(s3.name + " " + s3.id + " " + s3.age + " " + s3.mobile + " " + s3.isboy);
		Student s4 = new Student();
		s4.name = "ajith";
		System.out.println(s4.name);
	}

}
