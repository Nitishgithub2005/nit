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
    public static void main(String[] args) {
        Heap maxheap = new Heap();
        maxheap.insert(20);
        maxheap.insert(30);
        maxheap.insert(50);
        maxheap.insert(10);
        maxheap.insert(40);
        maxheap.print();
        maxheap.delete(50);
        maxheap.print();
    }

}
