package day1;

public class Final2 {
	public static void main(String[] args) throws Customexception {

		String a = "ka";
		try {
			if (a.equals("si")) {
				System.out.println(a);

			} else {
				throw new Customexception("Custom exception");
			}
		} finally {
			System.out.println("there is an finally	");
		}
	}
}