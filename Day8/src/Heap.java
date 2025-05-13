public class Heap {
    private int[] arr;
    private int size ;
    public Heap(){
        arr= new int[101];//array nto store heap elements
        arr[0]=-1;
        size=0;
    }
    public void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void print(){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert (int val){
        size++;
        arr[size]=val;
        int index=size;
        while (index > 1) {
            int parent = index/2;
            if(arr[parent] < arr[index]){
                swap(parent,index);
            }else{
                return;//the value is at correct position
            }
        }

    }
    public void delete (int val){
        if(size == 0){
            System.out.println("Heap is empty.Nothing to delete ");
            return ;
        }
        arr[1]=arr[size];//copy the last to the first/root
        // delete/remove the last
        size--;
        //propogate the root to its correct position
        int i=1;// root index
        //max to max we can go till size
        while(i<size){
            int leftIndex=2*i;
            int rightIndex=2*i+1;
            if(leftIndex <= size && arr[i]<arr[leftIndex]){
                swap(i,leftIndex);
                i=rightIndex;
            }else if (rightIndex <= size && arr[i]<arr[rightIndex]){
                swap(i,rightIndex);
                i=leftIndex;
            }
            else{
                //otherwise the value is at the correct position
                return;
            }
        }

    }
    public static void heapify(int[] arr, int i,int n){
        int largest=i;
        int left=2*i;
        int right=2*i+1;
        if(left <= n && arr[i]<arr[left]){
            largest=left;
        }
        if (right <= n && arr[i]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,largest,n);
        }
    }
    public static void main(String[] args) {
        Heap maxheap = new Heap();
        maxheap.insert(20);
        maxheap.insert(30);
        maxheap.insert(50);
        maxheap.insert(10);
        maxheap.insert(40);
        System.out.println("Before deletion");
        maxheap.print();
        System.out.println();
        System.out.println("After deletion");
        maxheap.delete(50);
        maxheap.print();
        System.out.println();
        int[] arr={-1,54,53,55,52,50};
        int n=5;
        for (int i = n/2; i >=0 ; i--) {
            heapify(arr,5,0);
        }
        System.out.println("Array after heapify");
        for (int i = 1; i <=n ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}
