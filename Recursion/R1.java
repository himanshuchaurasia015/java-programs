package Recursion;

import java.util.*;

public class R1 {
    static void printn(int i, int n) {
        if (n < i) {
            return;
        }
        System.out.print(i + " ");
        printn(i + 1, n);
    }

    static void printn2(int i, int n) {
        if (i == 0) {
            return;
        }

        printn2(i - 1, n);
        System.out.print(i + " ");

    }

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printn2(n, n);

    }
}
