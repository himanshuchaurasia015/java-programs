package Recursion;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        System.out.println("enter size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] input = s.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        solve(0, 0, arr, result);
        System.out.println(result);
        System.out.println(result.size());

        sc.close();
    }

    static void solve(int i, int sum, int[] arr, ArrayList<Integer> result) {

        if (i == arr.length) {
            result.add(sum);

            return;
        }
        // optimized
        // for (int j = i; j < arr.length; j++) {
        // if (j > i && arr[j] == arr[j - 1]) {
        // continue;
        // }
        // solve(j + 1, sum + arr[j], arr, result);

        // }
        solve(i + 1, sum + arr[i], arr, result);

        solve(i + 1, sum, arr, result);

    }
}
