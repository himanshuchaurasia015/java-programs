import java.util.*;

public class Lcm {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,temp,max;
        System.err.println("enter first number");
        a=sc.nextInt();
        System.err.println("enter Second number");
        b=sc.nextInt();
        temp=(a>b)?a:b;
        for(int i=temp;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.printf("lcm of %d and %d is %d",a,b,i);
                break;
            }
        }



    }
    
}
