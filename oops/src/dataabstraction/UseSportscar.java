package dataabstraction;

public class UseSportscar {
	public static void main(String[] args) {
		Sportscar s1 = new Sportscar();
		System.out.println(s1.brand());
		System.out.println(s1.showroom());
		s1.showroomDistence();
		System.out.println(s1.price());
		System.out.println(s1.model());
		System.out.println(s1.year(2010));
		s1.cc(300);
	}
}
