package day4;

public class Lms {
	public static void main(String[] arg) {
		String name = arg[0];
		System.out.println(name);
		String name1 = arg[1];
		System.out.println(name1);
		String name2 = arg[2];
		System.out.println(name2);
		String name3 = arg[3];
		System.out.println(name3);
		String name4 = arg[4];
		System.out.println(name4);
		System.out.println(name + " =" + name.toUpperCase());
		System.out.println(name1 + " last letter is = " + name1.charAt(name1.length() - 1));
		System.out.println(name2 + " first letter is " + name2.charAt(0));
		System.out.println(name4.concat(name3));
	}

}
