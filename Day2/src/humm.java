public class humm {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(humming_weight(n));
    }
    static int humming_weight(int n){
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) == 1) { // or if ( n%2 != 0)
                cnt++;
            }
            n=n/2; // or n=n>>1
        }
        return cnt;
    }
}
