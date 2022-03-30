import java.util.Scanner;

public class seq_1_1_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,a=1,b=1;
        for (int i=0; i<num ;i++){
            if (i==0)
                System.out.print(b+",");
            sum=a+b;
            a=b;
            b=sum;
            if (i==num)
                System.out.print(a);
            else
                System.out.print(a+",");
        }
    }
}
