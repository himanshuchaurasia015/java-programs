package PracticePrograms;
import java.util.*;
import java.lang.Character;

public class RemoveVowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s;
        s = sc.nextLine();
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch != 'i' && ch != 'a' && ch != 'e' && ch != 'o' && ch != 'u') {
                r += s.charAt(i);
            }
        }
        System.out.println(r);
    }

}
