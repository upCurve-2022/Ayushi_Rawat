import java.util.*;
public class left_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number  : ");
        System.out.println();
        int n =sc.nextInt();
        String s="";
        for (int i=1; i<=n;i++){
            s+="* ";
            System.out.println(s);
        }

}
}
