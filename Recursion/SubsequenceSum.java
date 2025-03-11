package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSum {
    static void subSequenceSum(int i, int k, int[] arr, int sum, ArrayList<Integer> temp) {
        if (sum == k) {
            System.out.println(temp);
            return;
        }
        if (i == arr.length || sum > k) {
            return;
        }
        temp.add(arr[i]);
        sum += arr[i];
        subSequenceSum(i + 1, k, arr, sum, temp);
        // temp.
        temp.remove(new Integer(arr[i]));
        sum -= arr[i];
        subSequenceSum(i + 1, k, arr, sum, temp);

    }

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        String[] s = input.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        subSequenceSum(0, n, arr, 0, new ArrayList<Integer>());

    }

}
