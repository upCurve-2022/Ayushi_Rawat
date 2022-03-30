import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n , rem=0,sum=0;
        while(temp>0){
            rem = temp%10;
            sum += rem*rem*rem;
            temp = temp/10;
        }
        if(n == sum)
            System.out.print("Armstrong Number");
        else
            System.out.print("Not an armstrong Number");


    }
}
