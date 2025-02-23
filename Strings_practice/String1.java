package Strings_practice;

import java.util.*;

public class String1 {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        System.out.println(a == b);// false
        System.out.println('a');// a
        System.out.println('a' + 'b');// 195
        System.out.println('a' + 3);// 100
        System.out.println("a" + 'b');// ab
        System.out.println("a" + "b");// ab
        System.out.println("a" + 1);// a1
        System.out.println("a" + new Integer(56));// a56
        System.out.println("a" + new ArrayList<>());// a[]
        // give error as any one should be string
        // System.out.println(new Integer(56) + new ArrayList<>());// error
        // it will not
        System.out.println(new Integer(56) + "" + new ArrayList<>());// 56[]
        String name = "hello";
        String name2 = "hello";
        System.out.println(name == name2);// true // address of name and name2 is comparing as string pool in heap has
                                          // one "hello" object
        name2 += "i";
        System.out.println(name == name2);// false //since new object is created which is "helloi" reference by name 2

    }

}
