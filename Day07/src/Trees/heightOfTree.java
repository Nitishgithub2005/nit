package Trees;
class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        this.data=x;
        this.left=this.right=null;
    }
}
public class heightOfTree {
    static int findHeight(Node root){
        if(root == null) return 0;
        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right= new Node(4);

        System.out.println("Height of the tree : "+findHeight(root));
    }
}
