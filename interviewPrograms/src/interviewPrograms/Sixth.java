package interviewPrograms;

public class Sixth {
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int [] b = {6,2,3,5};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					break;
				}
				else if(a[i] != b[j]){
					System.out.println(a[i] + " "+b[j]);
				}
			}
		}
	}
}
