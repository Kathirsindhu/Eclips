package day2;

public class UseMarker {
	public static void main(String[] arg) {
		Marker m1 = new Marker();
		m1.size = 8;
		m1.height = 16.5f;
		m1.weight = 14;
		m1.colour = "black";
		m1.brand = "camlin";
		m1.price = 50;
		System.out.println(
				m1.size + " " + m1.height + " " + m1.weight + " " + m1.colour + " " + m1.brand + " " + m1.price);

	}
}
