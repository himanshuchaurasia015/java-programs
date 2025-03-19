package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Permutation {
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
        solve(0, new HashMap<Integer, Integer>(), new ArrayList<Integer>(), arr, result);

        System.out.println(result);
        sc.close();
    }

    private static void solve(int i, HashMap<Integer, Integer> track, ArrayList<Integer> temp, int[] arr,
            ArrayList<ArrayList<Integer>> result) {
        if (track.size() == arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (track.get(j) == null) {
                temp.add(arr[j]);
                track.put(j, 1);
                solve(j, track, temp, arr, result);
                track.remove(j);
                temp.remove(temp.size() - 1);
            }
        }

    }
}
