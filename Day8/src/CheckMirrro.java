class Node{
    int data;
    Node left;
    Node right;
    Node (int val){
        data=val;
        left=right=null;
    }
}
public class CheckMirrro {
    public static void inorder(Node root){
        if (root != null){//LVR
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
    }
    public static Node mirror(Node root){
        if(root == null) return null;
        Node temp= root.left;
        root.left=root.right;
        root.right=temp;
        if (root.left != null) mirror(root.left);
        if (root.right != null) mirror(root.right);
    return root;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);

        System.out.println("In-order of original tree");
        inorder(root);
        root= mirror(root);
        System.out.println("\nIn-order of mirror tree");
        inorder(root);




    }
}
