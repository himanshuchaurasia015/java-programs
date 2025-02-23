
package SortingAndSearch;

import java.util.*;

public class LinearSearch {

    public static int search(String[] numsArr, int find) {
        for (int i = 0; i < numsArr.length; i++) {
            if (Integer.parseInt(numsArr[i]) == find) {
                return i;

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int find = sc.nextInt();
        String[] numsArr = nums.split(" ");
        System.out.println(search(numsArr, find));

    }

}
