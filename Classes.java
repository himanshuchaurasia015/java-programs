
import java.util.*;

import com.kunal.generics.LambdaFunctions;

// import OOPS.Vehicle;

public class Classes {

    public static void main(String[] args) {
        Student s = new Student();
        // s.name = "himanshu";
        System.out.println(s);
    }

}

class Student {
    String name;
    int rollnum;

    Student() {
        name = "himanshu";
        rollnum = 1;
    }

}
