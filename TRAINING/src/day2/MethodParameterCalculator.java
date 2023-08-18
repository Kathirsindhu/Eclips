package day2;

public class MethodParameterCalculator {
	public static void main(String[] arg) {
		MethodWithParameter p1 = new MethodWithParameter();
		p1.brand = "casio";
		p1.price = 500;
		System.out.println(p1.findaddition(100, 150));
		p1.findaddition1(10, 10.5f, 10.123d, 1000l, "java");

	}

}
