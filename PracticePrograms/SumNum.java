package PracticePrograms;
import java.util.*;
public class SumNum {

    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Strating Number");
        int start=sc.nextInt();
        System.out.println("Enter end of numbers");
        int e=sc.nextInt();
        int sum=0;
        sum=(start+e)*(e-start+1)/2;
//         for(int s=start;s<=e;s+=1){
// sum+=s;

//         }
        System.out.printf("sum of numbers from %d to %d is %d ",start,e,sum);


    }
    
}
