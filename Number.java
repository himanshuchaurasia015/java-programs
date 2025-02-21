import java.util.*;
class Number{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("odd");
        }else{
            System.out.println("Even");
        }
    }
}