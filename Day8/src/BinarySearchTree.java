class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }
}
public class BinarySearchTree {
    public static void inorder(TreeNode root) {
        if (root != null) {//LVR
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static TreeNode insert(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) return root;
        if (root.data < key) return search(root.right, key);
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while(curr != null && curr.left !=null){
            curr = curr.left; // keep going left
        }
        return curr;
    }
static TreeNode delete(TreeNode root,int key){
        if(root == null) return root;
        if(key < root.data) {
            root.left = delete(root.left,key);
        }
        else if(key < root.data) {
            root.right = delete(root.right,key);
        }
        else{
            //only one child
            if(root.left == null){
                TreeNode temp = root.right;
                root= null;
                return temp;
            } else if (root.right == null) {
                TreeNode temp = root.left;
                root= null;
                return temp;
            }
            //node with 2 children *** important
            // find the in-order successor of the root node
            // replace the root node with the successor
            TreeNode temp =findMin(root.right);
            root.data = temp.data;
            root.right =delete(root.right,temp.data);
        }
        return root;
}
    public static void main(String[] args) {
       TreeNode root =null;
       root=insert(root,50);
       int[] arr={30,40,80,70,10,60};
       for(int key:arr){
           insert(root,key);
       }
        System.out.println();
       int key=10;
       TreeNode result= search(root,key);
       if(result == null){
           System.out.println("Key "+key+ " is not found");
       }
       else {
           System.out.println("Key "+key+" is  found");
       }
        System.out.println("Delete 50");
       root=delete(root,50);
        System.out.println("InOrder Traversal ");
        inorder(root);
        System.out.println();

    }
}
