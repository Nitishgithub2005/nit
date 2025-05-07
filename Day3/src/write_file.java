import java.io.FileWriter;
import java.io.IOException;

public class write_file {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("./src/biet.txt", true);
        // if we don't write 'true' in this line then the existing data of file will get erase and new data is added it means it gets overridden
        writer.append("\n new line added 2 \n");
        writer.close();
        System.out.println("Succefully appended");
    }
}
