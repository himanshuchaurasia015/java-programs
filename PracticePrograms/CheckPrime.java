package PracticePrograms;
import java.util.*;
public class CheckPrime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long num=sc.nextLong();
        boolean flag=true;
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
        if(flag){
            System.out.printf("%d is a Prime number",num);
        }else{
            System.out.printf("%d is not a Prime number",num);

        }



    }
    
}
