import java.util.*;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest");
        System.out.println("Enter Money");
        int money= sc.nextInt();
        System.out.println("Enter time in years");
        int year=sc.nextInt();
        System.out.println("Enter interest rate");
        int rate=sc.nextInt();
        float result=0;
        result= (money * year * rate)/100;

        System.out.println("Simple Interst : "+result);
    }

}
