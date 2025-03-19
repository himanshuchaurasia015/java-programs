package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    static void subsequence(int i, int[] arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        if (i == arr.length) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }

        temp.add(arr[i]);
        subsequence(i + 1, arr, result, temp);
        temp.remove(temp.size() - 1);
        subsequence(i + 1, arr, result, temp);

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
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        subsequence(0, arr, result, new ArrayList<Integer>());
        System.out.println(result);
    }

}
