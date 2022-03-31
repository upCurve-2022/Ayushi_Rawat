import java.util.Scanner;

public class check_first_contain_second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String s2 = sc.nextLine();

        System.out.println(s1.contains(s2));
    }
}
