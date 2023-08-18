package preparationday1;

public class converttoint {
	public static void main(String[] args) {
		String a = "3,5,8,4,9,2";
		String[] b = a.split(",");
//		for (int i = 0; i < a.length() - 1; i++) {
//			System.out.print(b[i]);
//		}
		int[] num = new int[a.length()];
		for (int i = 0; i < b.length; i++) {
			num[i] = Integer.parseInt(b[i] + "");
		}
		String k = "";
		for (int i : num) {
			k += i;
		}
		int amk = Integer.parseInt(k);
//		int kk = 0;
//		for (int i = 0; i < num.length; i++) {
//			kk = num[i];
//		}
		System.out.println(amk);

	}
}
