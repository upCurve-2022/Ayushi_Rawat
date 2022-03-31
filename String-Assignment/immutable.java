import java.util.Scanner;
public class immutable {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner (System.in);
        String str1=sc.next();
        String str2=str1;
        if (str1==str2)
            System.out.println("Both string point to same reference ");
        else
            System.out.println("Both string point to different reference");
        System.out.println("After Changes in one string");
        str1+="new";
        if (str1==str2)
            System.out.println("Both string point to same reference ");
        else
            System.out.println("Both string point to different reference");



    }
}
