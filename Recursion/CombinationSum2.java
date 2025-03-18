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
            // if (!result.contains(temp))
            result.add(new ArrayList<>(temp));
        }
        if (i >= arr.length || target < 0) {
            return;
        }
        int curr = arr[i];
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1])
                continue; // Skip duplicates

            if (arr[j] > target)
                break; // No need to continue if current number is greater than target
            temp.add(arr[j]);
            combinationSum(j + 1, target - arr[j], arr, temp, result);
            temp.remove(temp.size() - 1);

        }

    }

}
