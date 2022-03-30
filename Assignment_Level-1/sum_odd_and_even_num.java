import java.util.*;

public class sum_odd_and_even_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();

        int odd=0;
        for (int i=1;i<=n;i+=2){
            odd+=i;

        }
        int even =0;
        for (int i=0; i<=n ;i+=2){
            even+=i;

        }
        System.out.println("Sum of N odd number: "+ odd);

        System.out.println("Sum of N even number :"+ even);


    }
}
