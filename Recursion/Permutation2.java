package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Permutation2 {
    public static void main(String[] args) {
        System.out.println("enter size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] input = s.split(" ");
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(0, arr, result);

        System.out.println(result);
        sc.close();
    }

    private static void solve(int i, Integer[] arr,
            ArrayList<ArrayList<Integer>> result) {
        if (i == arr.length) {

            result.add(new ArrayList<>(Arrays.asList(arr)));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            solve(i + 1, arr, result);
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
