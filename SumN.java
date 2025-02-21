import java.util.*;
public class SumN {
    public static void main(String[]Args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of natural numbers");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.printf("Sum of %d numbers is %d%n",n,sum);
    }
    
}
