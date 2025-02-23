package SortingAndSearch;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String s = sc.nextLine();
        String[] sArr = s.split(" ");
        for (String i : sArr) {
            arr.add(Integer.parseInt(i));
        }

        insertionSort(arr);
        bubbleSort(arr);
        System.out.println(arr);

    }

    static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr.get(j) < arr.get(j - 1)) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    static void bubbleSort(ArrayList<Integer> arr) {
        // int i = 0, step = arr.size();
        boolean swap = false;
        // while (step > 0) {
        // if (arr.get(i) > arr.get(i + 1)) {
        // int temp = arr.get(i);
        // arr.set(i, arr.get(i + 1));
        // arr.set(i + 1, temp);
        // swap = true;

        // }
        // i++;
        // if (i == step) {
        // if (!swap) {
        // break;
        // }
        // step--;
        // i = 0;
        // }

        // }
        for (int i = 0; i < arr.size(); i++) {
            swap = false;
            for (int j = 1; j < arr.size() - i; j++) {
                if (arr.get(j) < arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                    swap = true;
                }
            }
            System.out.println(arr);

            if (!swap)
                break;
        }

    }
}
