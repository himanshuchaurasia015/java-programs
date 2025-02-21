import java.util.*;
public class Greatest {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a,b;
        a=sc.nextInt();
        System.out.println("enter SEcond Number");
        b=sc.nextInt();
        int r=(a>b)?a:b;
        System.out.printf("Greatest between %d and %d is %d",a,b,r);
    }

}
