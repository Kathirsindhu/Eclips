package special;

public class KKKKKK {
	public static void main(String[] args) {
		String a = "kathiravan p";
		char[] c = a.toCharArray();
		int d = 0;
		for(int i=0;i<c.length;i++) {
			if(c[i] == ' ') {
				d = i;
			} 
		}
		System.out.println(d);
	}
}
