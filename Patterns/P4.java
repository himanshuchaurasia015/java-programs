package Patterns;

import java.util.*;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5