package PracticePrograms;
import java.util.*;

public class LengthOfString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        for (char ch : s.toCharArray()) {
            i += 1;
        }
        System.out.println(i);
    }

}
