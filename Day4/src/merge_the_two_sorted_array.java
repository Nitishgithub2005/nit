import java.util.Arrays;

public class merge_the_two_sorted_array {
    public static void main(String[] args) {
        int[] a1={1,4,6,7,8};
        int[] a2={2,3,5};
        int n1=a1.length;
        int n2=a2.length;
        int[] merge=new int[n1+n2];
        int i=0,j=0,k=0;
        while (i<n1 && j<n2) {
            if(a1[i]<a2[j]){
                merge[k++]=a1[i++];
            }
            else {
                merge[k++]=a2[j++];
            }
        }
        while(i<n1){
            merge[k++]=a1[i++];
        }
        while(j<n2){
            merge[k++]=a2[j++];
        }
        System.out.println(Arrays.toString(merge));
    }
}
