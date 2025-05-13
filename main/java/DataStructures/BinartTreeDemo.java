package DataStructures;

import java.util.*;

class BinaryTreeDemo {
    TreeNode root;

    public class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;
    TreeNode() {}
   TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
     }
   }

    public void createBinaryTree()
    {
        TreeNode first=new TreeNode(5);
        TreeNode second=new TreeNode(4);
        TreeNode third=new TreeNode(8);
        TreeNode fourth=new TreeNode(11);
        TreeNode five=new TreeNode();
        TreeNode six=new TreeNode(13);
        TreeNode seven=new TreeNode(4);
        TreeNode eight=new TreeNode(7);
        TreeNode nine=new TreeNode(2);
        TreeNode ten=new TreeNode();
        TreeNode eleven=new TreeNode();
        TreeNode twelve=new TreeNode();
        TreeNode thirteen=new TreeNode(1);

        root = first;
        first.left=second; //4
        first.right=third; //8

        second.left=fourth; //11
      //  second.right=five;//null

        third.left=six; //13
        third.right=seven;//4

        fourth.left=eight; //7
        fourth.right=nine; //2

      //  six.right=ten; //null
     //   six.left=eleven;//null

        seven.right=thirteen;//1
      //  seven.left=twelve; //null

    }

    public List<Integer> getTreeValues(TreeNode root)
    {
        List<Integer> al=new ArrayList<>();
        helper((ArrayList) al,root);
        return al;
    }

    private void helper(ArrayList al,TreeNode root) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        helper(al,root.left);
        helper(al,root.right);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        List<Integer> allPathSums = new ArrayList<>();

        if(root==null)
        {
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

       while(!queue.isEmpty()){
           int i=queue.size();
           while(i>0){
            TreeNode current= queue.poll();

            if(current.left!=null)
            {
              // int currentLeftValue=current.val;
              // int currentleftValue=current.left.val;
                current.left.val=current.left.val+current.val;
                queue.add(current.left);

                }
               if(current.right!=null)
               {
                  // int currentValueRight=current.val;
                 //  int currentRightValue=current.right.val;
                   current.right.val=current.right.val+current.val;
                   queue.add(current.right);

               }
               if (current.right == null && current.left == null) {
                   allPathSums.add(current.val);
               }
           i--;
           }
       }

       //Time Complexity : O(n * logn)
       //Space Complexity : O(n)+(2^(h-1))
                         // queue + leaf set
        //n is the number of nodes
        //h is the height of the tree
        //at max binary tree can 2^(h-1) leaf nodes

       return allPathSums.contains(targetSum);

    }

    public static void main(String[] args)
    {
        BinaryTreeDemo binarySearchIndex=new BinaryTreeDemo();
        //int[] arr = {5,4,8,11, Integer.parseInt(null),13,4,7,2, Integer.parseInt(null), Integer.parseInt(null), Integer.parseInt(null),1};
        binarySearchIndex.createBinaryTree();
        List<Integer> output= binarySearchIndex.getTreeValues(binarySearchIndex.root);

        output.stream().forEach(s->System.out.println(s));
        int targetSum = 22;
        boolean targetSumExist  = binarySearchIndex.hasPathSum(binarySearchIndex.root,targetSum);
        System.out.println("targetSumExist="+targetSumExist);
    }
}
