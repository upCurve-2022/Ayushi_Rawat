import java.util.*;
import java.lang.Math;
public class pow {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        System.out.println("Enter power value:");
        int n=sc.nextInt();
        int res=1;
        for (int i =0; i<n;i++){
            res*=X;
        }
        System.out.println("Answer"+res);



    }
}
