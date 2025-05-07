package DSA;

public class recusrive_binary_search {
    public static int binarysearch(int[] arr,int target,int low,int high){
        if (low > high){
            return -1;
        }
        int mid= low +(high-low)/2;
        if (arr[mid]== target ){
            return mid;
        } else if (arr[mid] > target ) {
            return binarysearch(arr,target,low,mid-1);
        }
        else {
            return binarysearch(arr,target,mid+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,12,14,23,34};
        int target=34;
        System.out.println(binarysearch(arr,target,0,arr.length-1));
    }
}
