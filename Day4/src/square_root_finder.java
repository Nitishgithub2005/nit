public class square_root_finder {
    static int search(int n){
        int low =0,high=n;
        int ans=-1;
        while  (low<=high){
            int mid=low + (high-low)/2;
            if ((mid*mid )== n) {
                return mid;
            } else if ((mid*mid) > n ) {
                high = mid-1;
            }
            else {
                ans=mid;
                low=mid+1;
            }
        }
       return ans;
    }
    public static void main(String[] args) {
        int n=68;
        System.out.println(search(n));
    }
}
