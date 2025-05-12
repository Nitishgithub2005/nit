import java.util.*;
import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("03","aaaa");
        hm1.put("01","bbbb");
        System.out.println("Iterating over hashmap");
        for(Map.Entry<String,String> entry :hm1.entrySet()){
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }
    }
}
