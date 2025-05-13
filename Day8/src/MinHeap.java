import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();// new PriorityQueue<>(Collections.reverseOrder());  for max heap
        minheap.add(10);
        minheap.add(1);
        minheap.add(5);
        minheap.add(2);
        minheap.add(12);
        minheap.add(11);
        System.out.println("Min heap :"+minheap);
        System.out.println("Smallest Element : "+minheap.poll());
    }
}
