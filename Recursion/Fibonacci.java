package Recursion;

import java.util.*;

public class Fibonacci {

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int l = fibonacci(n - 1);
        int s = fibonacci(n - 2);
        return l + s;
    }

    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
