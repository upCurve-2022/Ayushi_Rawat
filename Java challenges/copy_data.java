import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_data {
    public static void main(String[] args) {

        try {
            File f1 = new File("C://Users//Dell//OneDrive//Desktop//file//file1.txt");
            File f2 = new File("C://Users//Dell//OneDrive//Desktop//file//file2.txt");


            FileInputStream fin = new FileInputStream("C://Users//Dell//OneDrive//Desktop//file//file1.txt");
            FileOutputStream fout = new FileOutputStream("C://Users//Dell//OneDrive//Desktop//file//file2.tx");
            byte[] buffer = new byte[500];
            int length;

            while ((length = fin.read(buffer)) > 0) {
                fout.write(buffer, 0, length);
            }
            fin.close();
            fout.close();
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println("An error occurred");
        }

    }


}
