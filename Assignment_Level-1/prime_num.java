import java.util.*;
import java.lang.Math;
public class prime_num {
    public static void main(String[] args) {
        System.out.println("Enter two Number :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int y;
        int i=2,res=0;
        if (m%2==0)
            y=m/2;
        else
            y=m/2+1;

        while (n!=m) {
            i=2;
            int temp=0;
            while (i != y) {
                if (n%i==0) {
                    temp = 1;
                    break;
                }
                i+=1;
            }
            if (temp==0) {
                res = 1;
                System.out.println("Prime number :" + n);
            }
            n+=1;

        }
        if (res==0)
            System.out.println("No Prime Number Found ");

    }

}
