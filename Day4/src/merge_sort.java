import java.util.Arrays;

public class merge_sort {
    static void merge(int[] arr,int[] left,int[] right){
        int n1=left.length;
        int n2=right.length;
        int i=0,j=0,k=0;
        while (i<n1 && j<n2) {
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void merge_sorting(int[] arr){
        if(arr.length < 2){
            return;
        }
        int mid=arr.length/2;
        int[] left= Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
        merge_sorting(left);
        merge_sorting(right);
        merge(arr,left,right);

    }

    public static void main(String[] args) {
        int[] arr={3,3,63,7,6,8,2,2};
        merge_sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
