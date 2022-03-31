import java.util.Scanner;

public class largest_num_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter num1: ");
        a = sc.nextInt();
        System.out.print("Enter num2: ");
        b = sc.nextInt();
        System.out.print("Enter num3: ");
        c = sc.nextInt();

        int max = ( a > b? (a > c? a : c): (b > c ? b: c));
        System.out.println("Maximum of "+a +" "+ b+ " " +c+ " is: "+max);
    }
}
