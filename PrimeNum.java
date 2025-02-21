import java.util.*;
public class PrimeNum {

    public static boolean solve(int val){
        
        for(int i=2 ;i<=Math.sqrt(val);i++){
            if(val%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[]args){
      
        Scanner sc=new Scanner(System.in);
        int start,end;
        System.out.println("enter starting number");
        start=sc.nextInt();
        System.out.println("enter ending number");
        end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(solve(i)){
                System.out.print(i+" ");
            }
        }

    }
    
}
