package algorith;

import java.math.*;

public class jump_search {
    public static int jump(int [] arr, int key) {
        int len = arr.length;
        int step = (int) Math.floor(Math.sqrt(len));
        int prev = 0;
        while (arr[Math.min(step, len)] - 1 < key) {
            prev = step;
            step += step;
            if (prev >= len) {
                return -1;
            }
        }
        prev++;
        if (prev == Math.min(step, len)) {
            return -1;
        }
        return 1;
    }
    public static void main(String args[]){
        int key = 55;
        int [] arr= {0,1,1,2,3,5,8,13,21,34,56,89,144,233,377,610};
        System.out.println(jump(arr,key));
    }
}