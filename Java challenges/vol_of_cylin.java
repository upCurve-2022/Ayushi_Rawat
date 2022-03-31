import java.util.Scanner;

public class vol_of_cylin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius :");
        double radius =sc.nextInt();
        System.out.println("Enter Height :");
        double height =sc.nextInt();
        double vol= Math.PI *radius *radius *height;
        System.out.println("Volume of Cylinder : "+ vol);


    }
}
