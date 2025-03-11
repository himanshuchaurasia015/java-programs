package Patterns;

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");

            }
            System.out.println();
        }
    }

}
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5