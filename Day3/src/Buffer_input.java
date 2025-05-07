import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_input {
    public static void main(String[] args) throws IOException{
//        BufferedReader br = null;
       // String str;
        //this is using try , catch  and finally
//        try {
//            br = new BufferedReader(new InputStreamReader(System.in));
//            str = br.readLine();
//            System.out.println(str);
//        } catch (IOException e) {
//            System.out.println(e);
//        } finally {
//            br.close();
//        }

        // this is without catch and finally
    String str;
        try (BufferedReader br = new BufferedReader(new FileReader("test"))) {
            str = br.readLine();
            System.out.println(str);
        }
    }
}
