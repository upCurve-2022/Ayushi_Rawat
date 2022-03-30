import java.util.*;
import java.lang.Math;
public class bin_to_dec {
    public static void main(String[] args) {
        System.out.println("Enter a binary string :");
        Scanner sc = new Scanner(System.in);
        String st=sc.next();
        int deci=Integer.parseInt(st,2);
        System.out.println("Decimal number: "+deci);
    }
}
