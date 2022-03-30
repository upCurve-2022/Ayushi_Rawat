import java.util.*;
public class swap_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values for X,Y,Z:");
        int x=sc.nextInt();
        int y= sc.nextInt();
        int z=sc.nextInt();
        x=x+y+z;
        y=x-y-z;
        z=x-y-z;
        x=x-y-z;
        System.out.println("After Swapping: ");
        System.out.println("X :"+x);
        System.out.println("Y :"+y);
        System.out.println("Z :"+z);

    }

}

