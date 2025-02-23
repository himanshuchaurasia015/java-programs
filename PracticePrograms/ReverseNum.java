package PracticePrograms;
import java.util.*;


public class ReverseNum {

    public static void main(String args[]){
        int num,temp,reverse=0;
        System.err.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp!=0){
            reverse*=10;
            reverse+=temp%10;
            temp/=10;
        }
        System.err.printf("Reverse of %d is %d",num,reverse);
    }
    
}
