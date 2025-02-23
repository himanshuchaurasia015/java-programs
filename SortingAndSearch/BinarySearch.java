package SortingAndSearch;
import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int find = sc.nextInt();
        String[] sArr = s.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String n : sArr) {
            nums.add(Integer.parseInt(n));
        }
        int result = Binary(nums, find);
        System.out.println(result);

    }

    static int Binary(ArrayList<Integer> nums, int find) {
        // Collections.sort(nums);
        // System.out.println(nums);
        int n = nums.size();
        int start = 0, end = n - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            int value = nums.get(mid);
            if (value > find) {
                end = mid - 1;
            } else if (value < find) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
