package java8;

public interface StaticMethod {
	public static String setHai() {
		return "hai";
	}
	

	default String setHello() {
		return "hello";
	}
}
