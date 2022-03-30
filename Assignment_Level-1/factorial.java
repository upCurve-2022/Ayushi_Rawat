import java.util.*;
import java.lang.Math;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int n=1;
        int res=1;
        while(n!=num+1){
            res=res*n;
            n+=1;
        }
        System.out.println(res);

    }
}
