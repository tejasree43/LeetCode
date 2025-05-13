package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> getTreeValues(TreeNode root){

       ArrayList<Integer> al = new ArrayList<>();
       helperRecursion(al,root);

        return al;
    }

    private void helperRecursion(ArrayList<Integer> al, TreeNode root) {

        if(root==null){
            return;
        }
        al.add(root.val);
        helperRecursion(al,root.left);
        helperRecursion(al,root.right);
    }
}
 public class BinaryTreeRight199 {

     public List<Integer> rightSideView(TreeNode root) {
         ArrayList<Integer> al = new ArrayList<>();

      helperMethod(al,root);
       //  rec(root,al,0);

         return al;
     }
     void rec(TreeNode root,ArrayList<Integer> list, int depth) {

         if (root == null) return;
         if (list.size() == depth) {
             list.add(root.val);
         }
         if (root.right != null) rec(root.right, list, depth + 1);
         if (root.left != null) rec(root.left, list, depth + 1);
     }

     private void helperMethod(ArrayList<Integer> al, TreeNode root) {

         if(root == null){
             return ;
         }
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         while(!queue.isEmpty()) {

             int size = queue.size();

             for (int i = 0; i < size; i++) {

                 TreeNode node = queue.poll();

                 if(i==0){
                     al.add(node.val);

                 }
                 if (node.right != null) {
                     queue.add(node.right);
                 }
                 if (node.left != null) {
                     queue.add(node.left);
                 }
             }
         }

     }


     public static void main(String[] args){

   /*TreeNode root = new TreeNode(1)  ;
   TreeNode treeNode2 = new TreeNode(2)  ;
   TreeNode treeNode3 = new TreeNode(3)  ;
   TreeNode treeNode4 = new TreeNode(5)  ;
   TreeNode treeNode5 = new TreeNode(4)  ;

     root.left  = treeNode2 ;
     root.right = treeNode3;
     treeNode2.right = treeNode4;
     treeNode3.right = treeNode5;
     treeNode3.left=null;*/
         TreeNode root = new TreeNode(10)  ;
         TreeNode treeNode2 = new TreeNode(20)  ;
         TreeNode treeNode3 = new TreeNode(30)  ;
         TreeNode treeNode4 = new TreeNode(40)  ;
         TreeNode treeNode6 = new TreeNode(60)  ;

         root.left  = treeNode2 ;
         root.right = treeNode3;
         treeNode2.right = treeNode6;
         treeNode2.left=treeNode4;
         TreeNode treeNode = new TreeNode();
         List<Integer> listOutput1 = treeNode.getTreeValues(root);
         listOutput1.stream().forEach(System.out::println);


     System.out.println("output.......");
     BinaryTreeRight199 binaryTree = new BinaryTreeRight199();
         List<Integer> listOutput = binaryTree.rightSideView(root);
         listOutput.stream().forEach(System.out::println);
 }
}
