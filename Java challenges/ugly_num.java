import java.util.Scanner;
public class ugly_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean flag = true;
        while(num != 1){
            if (num % 5 == 0)
                num /= 5;
            else if (num % 3 == 0){
                num /= 3;
            }
            else if (num % 2 == 0){
                num /= 2;
            }
            else{
                System.out.println("Not an ugly number");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Is an ugly number");
    }
}
