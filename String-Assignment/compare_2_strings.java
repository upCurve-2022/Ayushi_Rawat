import java.util.Scanner;

public class compare_2_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String str1=sc.next();
        System.out.println("Enter String 2 :");
        String str2=sc.next();
        // first way
        String str3=str1;
        if (str1==str3)
            System.out.println("Same Strings");
        else
            System.out.println("Different strings");
        //Second way
        System.out.println("Two String are equal :"+ str1.equals(str2));
        //Third way
        System.out.println("Two String are equal :"+ str1.compareTo(str2));

    }
}
