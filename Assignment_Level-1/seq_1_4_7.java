import java.util.*;

public class seq_1_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int a=1;
        int b=4;
        int c=7;
        int val=0;
        if ( num==1 ) {
            System.out.println(a);
        }
        else if (num==2){
            System.out.println(b);
        }
        else if(num==3){
            System.out.println(c);
        }

        else{
            System.out.print(a+","+b+","+c);
            while (num!=3) {
                val=a+b+c;
                System.out.print(","+ val);
                a=b;
                b=c;
                c=val;
                num-=1;

            }
        }

    }
}
