package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static int partition(int low, int high, int[] arr) {
        int i = low, j = high;
        int pivot = low;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i < high) {
                i++;
            }
            while (arr[i] > arr[pivot] && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quickSort(int low, int high, int[] arr) {
        if (low >= high)
            return;
        int pivot = partition(low, high, arr);
        quickSort(low, pivot - 1, arr);
        quickSort(pivot + 1, high, arr);

    }

    public static void main(String[] args) {
        System.out.println("enter size of arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        String[] input = s.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
