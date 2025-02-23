package PracticePrograms;
import java.util.*;

public class Leapyear {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year,r;
        year=sc.nextInt();
        if(year%400==0){
            r=1;
        }else if(year%4==0 && year%100==0){
            r=1;
        }else{
            r=0;
        }
        if(r==1){
            System.out.printf("%d is a leap Year",year);
        }else{
            System.out.printf("%d is not a leap Year",year);

        }
        
    }
}
