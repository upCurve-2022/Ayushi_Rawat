import java.util.*;

public class seq_alternate_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        boolean temp=false;
        for (int i=1;i<=num;i++){
            if ( temp==false)
                System.out.print(-1*i+",");
            else
                System.out.print(i+",");
            temp=!temp;
        }


    }

}
