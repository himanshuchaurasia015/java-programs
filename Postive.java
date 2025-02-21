import java.util.*;
public class Postive {
    public static void main(String[]args){
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>0){
            System.out.println("Positive");

        }else if(n!=0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    }
}
