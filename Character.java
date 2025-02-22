import java.util.*;

public class Character {
    public static void main(String args[]) {
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.printf("%c is a vowel", a);
        } else {
            System.out.printf("%c is not a vowel", a);

        }

    }
}
