package for2;

public class Fibo {
	public static void main(String [] args) {
		int num=10;
		int a=0;
		int b=1;
		for(int i=0;i<=num;i++) {
			int c=a+b;
			System.out.println(a);
			a=b;
			b=c;

		}

	}
}