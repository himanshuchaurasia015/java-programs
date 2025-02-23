package PracticePrograms;
import java.util.*;

public class Hcf {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,r=1;
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter Second number");
b=sc.nextInt();
int temp=(a>b)?b:a;
for (int i=temp;i>=1;i--){
if(a%i==0 && b%i==0){
System.out.printf("HCF of %d and %d is %d%n",a,b,i);
break;
}
}
//second method
while (a != b)
{
    if (a > b)
        a -= b;
    else
        b -= a;
}


System.out.println("The HCF: "+ a);


    }
    
}
