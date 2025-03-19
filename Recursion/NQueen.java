package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        System.out.println("enter size of matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int[] is : arr) {
            Arrays.fill(is, 0);

        }
        solve(0, n, arr);
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
        sc.close();
    }

    private static boolean help(int i, int j, int n, int[][] arr) {
        // t
        if (i > 0) {
            for (int k = i - 1; k >= 0; k--) {
                if (arr[k][j] == 1) {
                    return false;
                }
            }
        }
        // b
        if (i < n - 1) {
            for (int k = i + 1; k < n; k++) {
                if (arr[k][j] == 1) {
                    return false;
                }
            }
        }
        // l
        if (j > 0) {
            for (int k = j - 1; k >= 0; k--) {
                if (arr[i][k] == 1) {
                    return false;
                }
            }
        }
        // r
        if (j < n - 1) {
            for (int k = j + 1; k < n; k++) {
                if (arr[i][k] == 1) {
                    return false;
                }
            }
        }

        // tl
        int r = i, c = j;
        while (r >= 0 && r < n && c >= 0 && c < n) {
            if (arr[r][c] == 1)
                return false;
            r--;
            c--;
        }
        // tr
        r = i;
        c = j;
        while (r >= 0 && r < n && c >= 0 && c < n) {
            if (arr[r][c] == 1)
                return false;
            r--;
            c++;
        }
        r = i;
        c = j;
        // bl
        while (r >= 0 && r < n && c >= 0 && c < n) {
            if (arr[r][c] == 1)
                return false;
            r++;
            c--;
        }
        r = i;
        c = j;
        // br
        while (r >= 0 && r < n && c >= 0 && c < n) {
            if (arr[r][c] == 1)
                return false;
            r++;
            c++;
        }

        return true;
    }

    private static boolean solve(int i, int n, int[][] arr) {
        if (i == n) {
            return true;
        }
        for (int j = 0; j < arr.length; j++) {
            if (help(i, j, n, arr)) {
                arr[i][j] = 1;
                if (solve(i + 1, n, arr))
                    return true;
                arr[i][j] = 0;

            }

        }
        return false;

    }
}
