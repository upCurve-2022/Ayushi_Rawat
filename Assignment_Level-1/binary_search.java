import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7}, temp=0;
        int search = sc.nextInt(), i;
        int s=0,e=a.length-1;
        int mid=0;
        while ( e>s ){
            mid=(s+e)/2;
            if (a[mid]==search){
                temp=1;
                break;
            }
            else if (a[mid]<search)
                s=mid+1;
            else
                e=mid-1;

        }
        if ( temp==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");

    }
}
