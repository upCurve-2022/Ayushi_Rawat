import java.io.File;
import java.io.IOException;
public class create_a_file {
    public static void main(String[] args) {
        try{
            File file = new File("C://Users//Dell//OneDrive//Desktop//file//xyz.txt");
            if (file.createNewFile()){
                System.out.println("File: " + file.getName() + " created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occurred: "+ e);
        }
    }

}
