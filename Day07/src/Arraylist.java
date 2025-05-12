import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(232);
        arrayList.add(76);
        arrayList.add(23);
        arrayList.add(78);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
