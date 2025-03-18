package Recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SubsetSun {
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
        HashSet<Integer> result = new HashSet<>();
        Arrays.sort(arr);
        solve(0, 0, arr, result);
        System.out.println(result);
        sc.close();
    }

    static void solve(int i, int sum, int[] arr, HashSet<Integer> result) {

        result.add(sum);
        if (i >= arr.length) {
            return;
        }

        solve(i + 1, sum + arr[i], arr, result);
        solve(i + 1, sum, arr, result);

    }
}
