package PracticePrograms;
import java.util.*;
public class PalindromeNumber {

    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
    System.out.println("Ener a number");
    int num,reverse=0;
    num=sc.nextInt();
    int temp=num;
    while(temp!=0){
        reverse*=10;
        reverse+=temp%10;
        temp/=10;
    }
    if(num==reverse){
        System.out.printf("%d is a palindrome",num);
    }else{
        System.out.printf("%d is not a palindrome",num);

    }

    }
   
}
