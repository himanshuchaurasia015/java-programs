package Patterns;

import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

}
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1