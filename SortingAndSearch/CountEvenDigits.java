package SortingAndSearch;

import java.util.*;

public class CountEvenDigits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] numsArr = nums.split(" ");
        int count = 0;
        for (String s : numsArr) {
            // System.out.printf("%s %d %b%n", s, s.length(), s.length() % 2 == 0);
            if (s.length() % 2 == 0) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
