import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("./src/biet.txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNext()){
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
