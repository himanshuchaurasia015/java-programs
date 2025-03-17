package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println("enter size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter target");
        int target = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] input = s.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(0, target, arr, new ArrayList<Integer>(), result);
        System.out.println(result);
        sc.close();
    }

    static void solve(int i, int curr, int[] arr, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result) {
        if (curr == 0) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        if (i >= arr.length || curr < 0)
            return;

        temp.add(arr[i]);
        solve(i, curr - arr[i], arr, temp, result);
        temp.remove(temp.size() - 1);
        solve(i + 1, curr, arr, temp, result);

    }

}
