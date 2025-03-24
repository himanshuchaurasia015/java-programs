
package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Nqueen2 {
    public static void main(String[] args) {
        System.out.println("enter size of matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int[] is : arr) {
            Arrays.fill(is, 0);

        }
        solveALL(0, n, arr);

        // solve(0, n, arr);
        // for (int[] is : arr) {
        // System.out.println(Arrays.toString(is));
        // }
        int[][] opt = new int[n][n];

        // optimizedSol(0, n, new int[2 * n - 1], new int[2 * n - 1], new int[n], arr);
        // optSolveALL(0, n, new int[2 * n - 1], new int[2 * n - 1], new int[n], arr);

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
        sc.close();
    }

    private static boolean help(int i, int j, int n, int[][] arr) {
        // t
        // Check column above
        for (int row = 0; row < i; row++) {
            if (arr[row][j] == 1) {
                return false;
            }
        }

        // Check top-left diagonal
        for (int row = i, col = j; row >= 0 && col >= 0; row--, col--) {
            if (arr[row][col] == 1) {
                return false;
            }
        }

        // Check top-right diagonal
        for (int row = i, col = j; row >= 0 && col < n; row--, col++) {
            if (arr[row][col] == 1) {
                return false;
            }
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

    // <Optimized------------------------------------------------------------------->

    private static boolean helpopt(int i, int j, int n, int[] right, int[] left, int[] col, int[][] arr) {
        if (right[i + j] != 0 || left[i - j + n - 1] != 0 || col[j] != 0) {
            return false;
        }
        right[i + j] = 1;
        left[i - j + n - 1] = 1;
        col[j] = 1;
        return true;
    }

    private static boolean optimizedSol(int i, int n, int[] right, int[] left, int[] col, int[][] arr) {
        if (i == n) {
            return true;

        }
        for (int j = 0; j < arr.length; j++) {
            if (helpopt(i, j, n, right, left, col, arr)) {
                arr[i][j] = 1;
                if (optimizedSol(i + 1, n, right, left, col, arr)) {
                    return true;
                }
                arr[i][j] = 0;
                right[i + j] = 0;
                left[i - j + n - 1] = 0;
                col[j] = 0;

            }

        }
        return false;

    }

    private static void optSolveALL(int i, int n, int[] right, int[] left, int[] col, int[][] arr) {
        if (i == n) {
            for (int[] is : arr) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println("--------------------------------------");
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (helpopt(i, j, n, right, left, col, arr)) {
                arr[i][j] = 1;
                solveALL(i + 1, n, arr);
                arr[i][j] = 0;
                right[i + j] = 0;
                left[i - j + n - 1] = 0;
                col[j] = 0;
            }

        }

    }

    // <Solution------------------------------------------------------------------------------------------------------------->

    private static void solveALL(int i, int n, int[][] arr) {
        if (i == n) {
            for (int[] is : arr) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println("--------------------------------------");
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (help(i, j, n, arr)) {
                arr[i][j] = 1;
                solveALL(i + 1, n, arr);
                arr[i][j] = 0;

            }

        }

    }
}
