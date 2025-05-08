import java.util.Arrays;

public class Sorting_question {
    //Given array of 0's 1's 2's sort the array without using any sorting algortihm in O(n) time complexity
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 0, 2, 1};
        int c_0 = 0, c_1 = 0, c_2 = 0;
        int l = 0, r = a.length - 1;
        for (int i:a) {
            if (i == 0) c_0++;
            else if (i == 1) c_1++;
            else c_2++;
        }
            int index = 0;
            while (c_0 > 0) {
                a[index++] = 0;
                c_0--;
            }
            while (c_1 > 0) {
                a[index++] = 1;
                c_1--;
            }
            while (c_2 > 0) {
                a[index++] = 2;
                c_2--;
            }

        System.out.println(Arrays.toString(a));
    }
}

