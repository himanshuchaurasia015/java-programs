import java.util.*;
public class Factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter a number");
        int num=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i + " ");
                // arr.add(i);
            }
        }
        System.out.println(num);
    }
}
