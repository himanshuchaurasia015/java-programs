package PracticePrograms;
import java.util.*;

public class Ascii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter charcter");
        char ch;
        ch = sc.next().charAt(0);
        System.out.println(ch + " Ascii value --->" + (int) ch);
    }
}
