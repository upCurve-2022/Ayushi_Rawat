public class duplicate_char {
    public static void main(String[] args) {
        String s = "United states";
        int count;

        char arr[] = s.toCharArray();
        System.out.println("Duplicate characters for the given string are: ");

        for (int i=0; i< arr.length; i++){
            count = 1;
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && arr[i]!=' ')
                {
                    count ++;
                    arr[j] = '0';
                }
            }
            if (count > 1 && arr[i] != '0')
                System.out.println(arr[i]);

        }
    }
}
