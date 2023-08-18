package oops2;

public class Pen extends StationaryProducts {
	String penBrand;
	String penType;
	int ledsize;

	public String quality(int price) {
		if (price < 150) {
			return "Good Qualitty";
		} else {
			return "average";
		}
	}
}
