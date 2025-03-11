package Strings_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountVowels {

    static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    static int[] countVowels(String s) {
        int[] arr = new int[2];
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    v += 1;
                    break;
                default:
                    c += 1;
            }

        }
        arr[0] = v;
        arr[1] = c;
        return arr;
    }

    static ArrayList<Character> nonRepeatingCharacters(char[] ch) {
        HashMap<Character, Integer> d = new HashMap<>();
        ArrayList<Character> r = new ArrayList<>();
        for (char c : ch) {
            if (d.get(c) == null) {
                d.put(c, 1);
            } else {
                if (!r.contains(c))
                    r.add(c);

            }

        }
        return r;
    }

    static String nonRepeating(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        StringBuilder r = new StringBuilder();
        for (char ch : s.toCharArray()) {
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        m.forEach((key, value) -> {
            if (value == 1) {

                r.append(key);
            }
        });
        // System.out.println(r);
        return r.toString();
    }

    static String removeDuplicates(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String r = "";

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == null) {
                r += ch;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse(s));
        System.out.println(Arrays.toString(countVowels(s)));
        System.out.println(nonRepeating(s));
        System.out.println(removeDuplicates(s));

    }

}
