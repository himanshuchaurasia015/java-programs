package PracticePrograms;
import java.util.*;
public class PrimeFactors {
    public static void main(String x[]){

   Scanner sc=new Scanner(System.in);
        System.err.println("Enter a number");
        int num=sc.nextInt();
        int i=2;
        while(num!=1){
            if(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }else{
                i+=1;
            }
            
        }

    }
    
}
