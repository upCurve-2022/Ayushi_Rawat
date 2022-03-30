import java.util.*;
import java.lang.Math;
public class seprate_Whole_num_and_fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        float num=sc.nextFloat();
        int a=(int)num;
        int count=0;
        for (int i=0; ;i++){
            if (num == (int)num)
                break ;
            else
                num*=10;
            count+=1;
        }


        int b=(int ) (num-(a*Math.pow(10,count)));
        System.out.println("Result ");
        System.out.println("Whole num: "+a);
        System.out.print("Fraction: "+b);



    }


}
