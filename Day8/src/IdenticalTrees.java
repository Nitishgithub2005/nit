//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int val){
//        data= val;
//        left=right=null;
//    }
//}
//public class IdenticalTrees {
//   static boolean areIdentical(Node tree1,Node tree2){
//       if(tree1 == null && tree2 == null)  return true;
//       if (tree1 == null || tree2 == null) return false;
//       if(tree1.data!=tree2.data) return false;
//       return areIdentical(tree1.left,tree2.left) &&  areIdentical(tree1.right,tree2.right);
//   }
//
//    public static void main(String[] args) {
//        Node tree1= new Node(1);
//        tree1.left= new Node(2);
//        tree1.right= new Node(3);
//        Node tree2= new Node(1);
//        tree2.left= new Node(3);
//        tree2.right= new Node(3);
//        if(areIdentical(tree1,tree2)){
//            System.out.println("Trees are Indentical");
//        }
//        else{
//            System.out.println("Trees are not identical");
//        }
//    }
//}
