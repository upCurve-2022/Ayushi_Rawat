import java.util.*;
public class swap_2_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a: ");
        int a=sc.nextInt();
        System.out.println("Enter a number b: ");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping ");
        System.out.println(" a :"+a);
        System.out.println(" b :"+b);

    }
}
