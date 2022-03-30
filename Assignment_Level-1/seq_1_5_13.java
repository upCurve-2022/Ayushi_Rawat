import java.util.*;
import java.lang.Math;
public class seq_1_5_13 {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int n=1;
        int b;
        int res;
        while ( n!=num+1 ){
            int a=3*(n-1)*(n-1);
            if (n%2==0)
                b=(3+(1))/2;
            else
                b=(3-1)/2;
            res=a+b;
            System.out.print(res+ " ,");
            n+=1;
        }
    }

}
