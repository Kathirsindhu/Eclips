package dataabstraction;

public class UsePetShop {
	public static void main(String[] args) {
		PetShop p1 = new PetShop();
		System.out.println(p1.name());
		System.out.println(p1.location("chennai"));
		System.out.println(p1.shopNo(3 ));
	}
}
