import java.util.*;

public class SortingPractice {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        System.out.println("ENTER NUMBERS");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s_arr = s.split(" ");
        int[] arr = new int[s_arr.length];
        for (int i = 0; i < s_arr.length; i++) {
            arr[i] = Integer.parseInt(s_arr[i]);
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("ENTER TARGET");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] > target) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;

        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }

    }

}
