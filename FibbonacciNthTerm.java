import java.util.*;
public class FibbonacciNthTerm {

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int f=0,s=1,num,t=0;
    System.out.println(("enter your number"));
    num=sc.nextInt();
    if(num==1){
        t=0;
    }else if(num==2){
        t=1;
    }else{
        for(int i=3;i<=num;i++){
            t=f+s;
            f=s;
            s=t;
        }
    }
 System.out.printf("%d is %d term of fibonnaccii",t,num);

    }
    
}
