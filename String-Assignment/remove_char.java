import java.util.Locale;
import java.util.Scanner;

public class remove_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.next();
        String str1=str.toLowerCase();
        System.out.println("Enter a character you want to remove");
        char rem=sc.next().charAt(0);
        char fin=Character.toLowerCase(rem);
        String out = str1.replace(fin, Character.MIN_VALUE);
        System.out.println("The Final String :" + fin + " is " + out);




    }
}
