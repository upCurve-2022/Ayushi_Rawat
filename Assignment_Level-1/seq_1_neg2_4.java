import java.util.Scanner;

public class seq_1_neg2_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int even=-2,odd=1;
        for(int i=1; i<=num; i++){
            if(i%2==0)
                System.out.print(even + ", ");
            else
                System.out.print(odd+", ");

            if(i%2==0)
                even += (-4);
            else
                odd += 3;
        }


    }
}
