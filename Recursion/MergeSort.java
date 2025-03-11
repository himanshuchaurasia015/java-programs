package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int s, int e, int n, int[] arr) {
        if (s >= e)
            return;
        int mid = s + (e - s) / 2;
        mergeSort(0, mid, n, arr);
        mergeSort(mid + 1, e, n, arr);
        sort(s, mid, e, arr);
    }

    static void sort(int low, int mid, int h, int[] arr) {
        int l = mid + 1;
        int s = low;
        ArrayList<Integer> temp = new ArrayList<>();
        while (s <= mid && l <= h) {
            if (arr[s] <= arr[l]) {
                temp.add(arr[s]);
                s += 1;

            } else {
                temp.add(arr[l]);
                l += 1;

            }
        }
        while (s <= mid) {
            temp.add(arr[s]);
            s += 1;
        }
        while (l <= h) {
            temp.add(arr[l]);
            l += 1;
        }
        for (int i = low; i <= h; i++) {
            arr[i] = temp.get(i - low);
        }

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
        mergeSort(0, n - 1, n - 1, arr);

        System.out.println(Arrays.toString(arr));
    }
}
