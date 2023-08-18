package list;

import java.util.ArrayList;

public class UsePlayers {
	public static void main(String[] args) {
		Players p1 = new Players("dhoni", 35, "male", "csk", 10000, 7);
		Players p2 = new Players("raina", 30, "male", "csk", 9000, 3);
		Players p3 = new Players("jadeja", 32, "male", "mi", 8000, 8);
		Players p4 = new Players("bravo", 40, "male", "csk", 7000, 47);
		Players p5 = new Players("ruthu", 32, "male", "csk", 6000, 2);
		Players p6 = new Players("moenali", 35, "male", "csk", 5000, 89);
		Players p7 = new Players("rayudu", 35, "male", "csk", 4000, 5);
		Players p8 = new Players("mithali", 25, "female", "india", 6000, 45);
		Players p9 = new Players("pvsindhu", 30, "female", "india", 5000, 65);
		Players p10 = new Players("deeptisharma", 29, "female", "india", 3000, 6);
		ArrayList<Players> pl = new ArrayList<>();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		pl.add(p5);
		pl.add(p6);
		pl.add(p7);
		pl.add(p8);
		pl.add(p9);
		pl.add(p10);
		for (int i = 0; i < pl.size(); i++) {
			if (pl.get(i).getGender().equalsIgnoreCase("female")) {
				// System.out.println(pl.get(i));
			}
		}
		for (Players a : pl) {
			if (a.getRuns() > 1000 && a.getRuns() < 6000) {
				// System.out.println(a);
			}
		}
		// pl.forEach(x -> System.out.println(x));
		pl.forEach(a -> {
			if (a.getRuns() < 5000) {
				// System.out.println(a);
			}

		});
		ArrayList<Players> male = new ArrayList<>();
		for (int i = 0; i < pl.size(); i++) {
			if (pl.get(i).getGender().equalsIgnoreCase("male")) {
				male.add(pl.get(i));
			}
		}
		// System.out.println(male);
		ArrayList<Players> female = new ArrayList<>();
		for (Players a : pl) {
			if (a.getGender().equalsIgnoreCase("female")) {
				female.add(a);

			}
		}
		// System.out.println(female);
		ArrayList<Players> csk = new ArrayList<>();
		pl.forEach(a -> {
			if (a.getTeamName().equalsIgnoreCase("mi")) {
				csk.add(a);
			}
		});
		System.out.println(csk);
	}
}
