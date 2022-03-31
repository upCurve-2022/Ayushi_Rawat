import java.util.Scanner;
public class ascii_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input character: ");
        char ch = sc.next().charAt(0);

        int toASCII = (int) ch;
        System.out.println("ASCII value of "+ch+" is : "+toASCII);
    }
}
