import java.util.*;

public class SumOfDigits {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,sum=0;
System.out.println("enter a number");
n=sc.nextInt();
int temp=n;
while(n!=0){
int r=n%10;
n=n/10;
sum+=r;
}
System.out.printf("sum of digits of %d is %d",temp,sum);

    }
}
