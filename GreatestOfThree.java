import java.util.*;
public class GreatestOfThree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,r;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        System.out.println("Enter Third number");
        c=sc.nextInt();
       if(a>b){
        if(b>c){
            r=a;
        }else if(c>a){
            r=c;
        }else{
            r=b;
        }
       }else if(b>c){
        r=b;
       }else{
        r=c;
       }
       System.out.printf("grestest between %d and %d and %d is %d ",a,b,c,r);
    }


    
}
