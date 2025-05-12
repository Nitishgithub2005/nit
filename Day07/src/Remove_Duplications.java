import java.util.HashSet;
public class Remove_Duplications {
    public static void main(String[] args) {
        int[] arr={98,2,5,2,2,3,7,8};
        HashSet<Integer> set = new HashSet<>();
        for (int a:arr){
            set.add(a);
        }
        System.out.println(set);
    }
}
