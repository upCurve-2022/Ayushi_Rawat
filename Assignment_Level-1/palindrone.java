import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String st=sc.next();
        int val;
        int len=st.length();
        if ( len%2==0)
            val=len/2;
        else
            val=len/2+1;
        int res=0;
        for (int i =0 ; i<=val;i++){
            if ( st.charAt(i)!=st.charAt(len-1-i) ) {
                res = 1;
                break;
            }

        }
        if (res == 0){
            System.out.println(" String is Palindrome");

        }
        else
            System.out.println(" String is not Palindrome");

    }
}
