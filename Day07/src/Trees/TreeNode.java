package Trees;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public static void preorder(TreeNode root){
        if (root != null){//VLR
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(TreeNode root){
        if (root != null){//LVR
            preorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
    }
    public static void postorder(TreeNode root){
        if (root != null){//LRV
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        }
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode( 5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("pre - order ");
        preorder(root);
        System.out.println("\n\nin - order ");
        inorder(root);
        System.out.println("\n\npost - order ");
        postorder(root);
    }
}
