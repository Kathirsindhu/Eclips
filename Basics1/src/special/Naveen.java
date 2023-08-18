package special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Naveen {
	public static void main(String[] args) {
		String [] a = {"one","two","one","three"};
        Set<String> b = new HashSet<>();
        for(String x : a) {
            b.add(x);
        }
        b.forEach(x->System.out.println(x));
        ArrayList<String> c = new ArrayList<>(b);
        System.out.println(c);
	}

}
