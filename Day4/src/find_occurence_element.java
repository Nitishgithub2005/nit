public class find_occurence_element {
    //find the first,last and total occurrence of the element
    static int first_occurence(int key,int[] arr){
        int low=0,high=arr.length;
        int ans=0;
        while(low<=high){
            int mid= low + (high -low)/2;
            if(arr[mid]==key){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>key){
                high =mid-1;
            }
            else{
                low=mid+1;
            }

        } return ans;
    }
    static int last_occurence(int key,int[] arr){
        int low=0,high=arr.length;
        int ans=0;
        while(low<=high){
            int mid= low + (high -low)/2;
            if(arr[mid]==key){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>key){
                high =mid-1;
            }
            else{
                low=mid+1;
            }

        } return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,5,5};
        int key=3;
        int f=first_occurence(key,arr);
        int l=last_occurence(key,arr);
        System.out.println("first occurence " +f+" and last occurence is "+l);
        System.out.println("Total occurence is "+( (l-f)+1));
    }
}
