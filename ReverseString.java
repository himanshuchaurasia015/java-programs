import java.util.*;

public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        StringBuilder st = new StringBuilder();
        String s = sc.nextLine();
        for (char i : s.toCharArray()) {
            st.append(i);
        }
        st.reverse();
        System.out.println(st);
    }

}
