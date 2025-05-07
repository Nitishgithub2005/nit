public class NonRepeatingElement {
    public static void main(String[] args) {
        // this will work for only single uniue elment in the array
        int[] arr={3,1,2,2,4,1,3};
        int res=0;
        for (int i=0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        System.out.println("result is : "+ res);
    }
}
