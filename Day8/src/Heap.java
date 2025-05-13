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

    public static void main(String[] args) {
        Heap maxheap = new Heap();
        maxheap.insert(20);
        maxheap.insert(30);
        maxheap.insert(50);
        maxheap.insert(10);
        maxheap.insert(40);
        maxheap.print();
    }

}
