package interviewPrograms;

import java.util.Scanner;

public class SortIntegerListWithoutSortMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();

        int[] list = new int[size];
        System.out.print("Enter the elements of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        // Sort the list without using the sort() method
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        // Print the sorted list
        System.out.print("The sorted list is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

