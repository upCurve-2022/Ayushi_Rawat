import java.util.Scanner;

public class only_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.next();
        int temp=0;
        for (int i =0;i< str.length();i++){
            if (Character.isDigit(str.charAt(i))) {
                temp++;

            }
            else{
                    temp = 0;

                }
        }
        if ( temp==str.length() )
            System.out.println("String with digits only !!");
        else
            System.out.println("String with characters  ");



    }
}
