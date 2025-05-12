import java.util.Hashtable;
import java.util.Map;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht= new Hashtable<>();
        ht.put(106,"Shree");
        ht.put(117,"Rama");
        ht.put(128,"Nitish");
        ht.put(102,"Monica");
        ht.put(99,"saraswati");
        ht.put(100,"pooja");
        for(Map.Entry kv: ht.entrySet()){
            System.out.println(kv.getKey()+" "+kv.getValue());
        }
    }
}
