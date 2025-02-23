package PracticePrograms;
import java.util.*;
import java.lang.Character;

public class SumOfDigitsInCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                sum += Character.getNumericValue(s.charAt(i));

        }
        System.out.println(sum);
    }

}
