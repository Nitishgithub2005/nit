class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        data=val;
        left=right=null;
    }
}
public class BalancedBTSfromSortedArray {
    static void inorder(Node root){
        if (root != null){//LVR
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
    }
    static Node sortedArrayFromsortedBST(int[] arr ,int s,int e){
    if(s>e) return null;
    int mid=s+(e-s)/2;
    Node root = new Node(arr[mid]);
    root.left=sortedArrayFromsortedBST(arr,s,mid-1);
    root.right=sortedArrayFromsortedBST(arr,mid+1,e);
    return root;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        Node root=sortedArrayFromsortedBST(arr,0,n-1);
        System.out.println("Inorder: " );
        inorder(root);
    }
}
