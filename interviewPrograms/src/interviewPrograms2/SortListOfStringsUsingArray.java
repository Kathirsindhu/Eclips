package interviewPrograms2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringsUsingArray {

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int[] order = {0, 1, 1, 0, 1, 2, 2, 0};

        // Create a list of strings
        List<String> list = Arrays.asList(strings);

        // Create a comparator that compares strings based on the order array
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return order[o1.charAt(0)] - order[o2.charAt(0)];
            }
        };

        // Sort the list using the comparator
        list.sort(comparator);

        // Print the sorted list
        System.out.println(list);
    }
}
