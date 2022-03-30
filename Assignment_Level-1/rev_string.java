import java.util.Scanner;

public class rev_string {
    public static void main(String[] args) {

        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        String rev = "";
        for (int i = 0; i < len; i++) {
            char ch = st.charAt(i);
            rev = ch + rev;
        }
        System.out.println("Reverse string: " + rev);
    }
}