package java8;

public class UseStaticMethod extends StaticObject implements StaticMethod {
	public static String setHai(int a) {
		return "haiHello";
	}

	public static void main(String[] args) {
		System.out.println(StaticMethod.setHai());
		System.out.println(StaticObject.setHai());
		StaticObject s = new StaticObject();
		System.out.println(s.setHello());
		System.out.println(s.setHello());

	}

}
