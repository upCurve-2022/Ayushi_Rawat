import java.io.*;
public class use_fileoutputstream {
    public static void main(String[] args) throws Exception{

        String s = "Here is a sample text to the file.";
        try{
            FileOutputStream fout = new FileOutputStream("C://Users//Dell//OneDrive//Desktop//file//file1.txt");

            char ch[] = s.toCharArray();
            for (int i = 0; i < s.length(); i++){
                fout.write(ch[i]);
            }

            fout.flush();
            fout.close();
        }
        catch(Exception e){
            System.out.println("An error occurred" +e);
        }
    }
}
