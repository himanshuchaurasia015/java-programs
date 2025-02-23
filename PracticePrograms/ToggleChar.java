package PracticePrograms;
import java.util.*;
import java.lang.Character;

public class ToggleChar {

    public static void main(String[] args) {
        String s;
        s = "PrePInsTa";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i)))
                s1 = s1 + Character.toLowerCase(s.charAt(i));
            else
                s1 = s1 + Character.toUpperCase(s.charAt(i));
        }
        s1 += s1;

        System.out.println("Toggle String is : " + s1);

    }
}
