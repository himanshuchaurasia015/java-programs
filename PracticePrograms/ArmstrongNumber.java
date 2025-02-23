package PracticePrograms;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String args []){
        int num,temp,sum=0;
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter a number");
        num=sc.nextInt();
        temp=num;
        int i=0;
        while(temp!=0){
            i+=1;
            temp/=10;
        }
        temp=num;
        while(temp!=0){
            int r=temp%10;
            temp/=10;
            sum+=Math.pow(r, i);
        }
        System.err.println(sum);
        if(sum==num){
            System.out.printf("%d is a armstrong number",num);
        }else{
            System.out.printf("%d is not a armstrong number",num);

        }


    }
    
}
