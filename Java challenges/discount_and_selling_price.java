import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class discount_and_selling_price {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Price of the pen :");
        int price = sc.nextInt();
        System.out.println("Enter discount : ");
        int dis =sc.nextInt();
        float x=(price*dis)/100;
        System.out.println("Discounted value: "+ x);
        System.out.println("Selling Price :"+ (price-x));






    }
}
