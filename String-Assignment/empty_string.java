import java.util.Scanner;

public class empty_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String str=sc.next();
        if (str.length()==0)
            System.out.println("String is Empty");
        else
            System.out.println("String Not Empty");


    }
}
