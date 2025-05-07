package DSA;

public class binary_search {
    public static int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low <=high){
            int m = low + (high -low)/2;
            if (arr[m]== target ){
                return m;
            } else if (arr[m] > target ) {
                high = m - 1;
            }
            else {
                low = m +1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,12,14,23,34};
        int target=14;
        System.out.println(binarysearch(arr,target));
    }
}
