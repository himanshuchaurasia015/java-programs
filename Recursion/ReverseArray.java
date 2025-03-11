package Recursion;

import java.util.*;

public class ReverseArray {
    static void printReverse(int[] arr, int n) {
        if (n < 0)
            return;
        System.out.print(arr[n] + " ");

        printReverse(arr, n - 1);
    }

    static void reverse(int l, int r, int[] arr, int n) {
        if (l >= r || l < 0 || r > n) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(l + 1, r - 1, arr, n);
    }

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String input = sc.nextLine();
        String[] s = input.split(" ");
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        printReverse(arr, n - 1);
        reverse(0, n - 1, arr, n);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}
