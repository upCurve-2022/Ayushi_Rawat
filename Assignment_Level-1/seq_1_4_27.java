import java.util.*;
import java.lang.Math;
public class seq_1_4_27 {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while (i!=num+1){
            System.out.print((int) Math.pow(i,i)+",");
            i+=1;

        }

    }
}
