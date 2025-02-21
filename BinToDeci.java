import java.util.*;

public class BinToDeci {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Binary number");
        int temp, bin=sc.nextInt();
temp=bin;
        int i=0,deci=0;
        while(bin!=0){
            int r=bin%10;
            bin/=10;
            deci+=r*Math.pow(2, i);
            i+=1;
        }
        System.out.printf("%d---->%d",temp,deci);
    }
}
