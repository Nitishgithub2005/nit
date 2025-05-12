import java.util.LinkedHashSet;
import java.util.Set;
public class hash {
    public static void main(String[] args) {
        String[] names ={"Rahul","Virat","Rahul","Shubman","Virat","Rohit"};
        Set<String> uniname = new LinkedHashSet<>();
        for(String name :  names){
            uniname.add(name);
        }
        System.out.println("After removing duplicate");
        System.out.println(uniname);
        uniname.forEach(System.out::println);
    }
}
