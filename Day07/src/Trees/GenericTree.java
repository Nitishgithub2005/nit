package Trees;

public class GenericTree <X>{
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;

    public GenericTree(X data) {
        this.data=data;
        this.left=this.right=null;
    }
    void preorder(){
            System.out.print(this.data+ " ");
            if (this.left != null) this.left.preorder();
          if (this.right != null) this.right.preorder();
        }

     void inorder(){
         if (this.left != null) this.left.inorder();
         System.out.print(this.data+ " ");
         if (this.right != null) this.right.inorder();
    }
   void postorder(){
       if (this.left != null) this.left.postorder();
       if (this.right != null) this.right.postorder();
       System.out.print(this.data+ " ");
    }

    public static void main(String[] args) {
        GenericTree<Integer> root=new GenericTree<>(1);
        root.left = new GenericTree(2);
        root.right = new GenericTree(3);
        root.left.left = new GenericTree(4);
        root.left.right = new GenericTree( 5);
        System.out.println("pre-order ");
        root.preorder();
        System.out.println("\n\nin-order ");
        root.inorder();
        System.out.println("\n\npost-order ");
        root.postorder();

        GenericTree<String> charroot=new GenericTree<>("a");
        root.left = new GenericTree("b");
        root.right = new GenericTree("c");
        root.left.left = new GenericTree("d");
        root.left.right = new GenericTree( "e");
        System.out.println(" \n--------- ");
        System.out.println("pre-order ");
        root.preorder();
        System.out.println("\n\nin-order ");
        root.inorder();
        System.out.println("\n\npost-order ");
        root.postorder();

    }
}
