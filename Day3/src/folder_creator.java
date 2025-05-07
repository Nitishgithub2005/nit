import java.io.File;
import java.io.IOException;

public class folder_creator {
    public static void main(String[] args) throws IOException {
        File f= new File(
                "/Users/nitishrmaladakar/Desktop/ADjava/Day3/src/New_Folder_created_by_java/demo.java"
        );
        if (f.createNewFile()){ //.delete() // .mkidr() etc..
            System.out.println("Folder "+ f.getName()+" Created");
        }
        else{
            System.out.println("Folder already exist");
        }
    }
}
