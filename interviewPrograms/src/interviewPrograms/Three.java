package interviewPrograms;

public class Three {
	public static void main(String[] args) {
		String a = "java";
		String b = "deve";
		String c = a.substring(0,2);
		String d = c.concat(b)+a.substring(2,4);
		System.out.println(d);
	}
}
