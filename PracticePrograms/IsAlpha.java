package PracticePrograms;
import java.util.*;

public class IsAlpha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(0);
        if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z') {
            System.out.printf("%c is Alphabet", ch);
        } else {
            System.out.printf("%c is not a Alphabet", ch);

        }
    }

}
