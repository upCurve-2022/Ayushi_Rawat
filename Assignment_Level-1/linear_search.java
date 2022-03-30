import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,10,3,4,5,6,7}, temp=0;
        int search = sc.nextInt(), i;
        for(i=0; i<a.length; i++)
            if(a[i] == search){
                temp = 1;
                break;
            }
        if(temp == 1)
            System.out.print("Found at position "+(i+1));
        else
            System.out.print("Not found");


    }
}
