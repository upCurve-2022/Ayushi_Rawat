import java.util.*;

public class Seq_4_16_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num =sc.nextInt();
        int temp=1;
        int res=0;
        int pre=1;
        while (num!=0){
            res=4*pre;
            System.out.print(res+",");
            temp+=2;
            pre+=temp;
            num-=1;

        }


    }

}
