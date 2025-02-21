import java.util.*;
public class Fibbonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int f,s,num=sc.nextInt();
        f=0;s=1;
        if(num==1){
            System.out.println(0);
       }else{
    
        System.out.print(0+" ");
        System.out.print(1+" ");
    
            for (int i=3;i<=num;i++){
                int t=s+f;
                f=s;
                s=t;
                System.out.print(t+" ");

            }
        }

    }
    
}
