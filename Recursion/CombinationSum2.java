package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombinationSum2 {
    public static void main(String[] args) {
        System.out.println("enter size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter target");
        int target = sc.nextInt();
        sc.nextLine();
        System.out.println("enter array elements space separated");
        String s = sc.nextLine();
        String[] input = s.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        combinationSum(0, target, arr, new ArrayList<>(), result);
        System.out.println(result);
        sc.close();
    }

    static void combinationSum(int i, int target, int[] arr, ArrayList<Integer> temp,
            ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            if (!result.contains(temp))
                result.add(new ArrayList<>(temp));
        }
        if (i >= arr.length || target < 0) {
            return;
        }
        temp.add(arr[i]);
        for (int j = i + 1; j < arr.length; j++) {
            combinationSum(j, target - arr[i], arr, temp, result);
        }
        temp.remove(temp.size() - 1);
        combinationSum(i + 1, target, arr, temp, result);

    }

}
