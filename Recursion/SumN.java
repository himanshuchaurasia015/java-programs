package Recursion;

import java.util.*;

import java.util.Scanner;

public class SumN {
    static int sumN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumN(n - 1);

    }

    static void sumN2(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumN2(n - 1, sum + n);

    }

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumN(n));
        sumN2(n, 0);
    }
}
