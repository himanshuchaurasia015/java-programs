package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class Subset {
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
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // Collections.sort(result);
        Arrays.sort(arr);
        solve(0, new ArrayList<Integer>(), arr, result);
        System.out.println(result);
        System.out.println(result.size());

        sc.close();
    }

    private static void solve(int i, ArrayList<Integer> temp, int[] arr,
            ArrayList<ArrayList<Integer>> result) {

        result.add(new ArrayList<>(temp));

        for (int j = i; j < arr.length; j++) {
            //for unique subset
            // if (j > i && arr[j] == arr[j - 1]) 
            // continue;
            temp.add(arr[j]);
            solve(j + 1, temp, arr, result);
            temp.remove(temp.size() - 1);

        }

    }
}
