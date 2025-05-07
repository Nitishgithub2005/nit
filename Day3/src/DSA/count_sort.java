package DSA;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class count_sort {
    static void countSort(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int[] count= new int[max+1];
        //calculate the frequency
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for (int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
        }

        int[] out= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            out[--count[arr[i]]]=arr[i];
        }
        System.arraycopy(out,0,arr,0,arr.length);
    }
    public static void main(String[] args) {
        int[] arr={3,4,6,1,4,3,2,3,1};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
