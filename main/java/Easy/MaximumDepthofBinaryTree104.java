package Easy;

import DataStructures.BinaryTreePreorderTraversal144;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MaximumDepthofBinaryTree104 {
    public int maxDepthBFS(TreeNode root) {

        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        int result=0;
        while(!queue.isEmpty()){
            int i=queue.size();
            while(i>0){
                TreeNode current= queue.poll();

                if(current.left!=null)
                {
                    queue.add(current.left);
                }
                if(current.right!=null)
                {
                    queue.add(current.right);

                }

                i--;
            }
            result++;
        }
        System.out.println("result"+result);

        return result;

    }
    public int maxDepthDFS(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();

        stack.push(root);
        value.push(1);

        int level=0;
        while(!stack.isEmpty()){
          int temp = value.pop();
          level= Math.max(temp,level);
          TreeNode current = stack.pop();

            if(current.right !=null){
                stack.push(current.right) ;
                value.push(temp+1);
            }
            if(current.left !=null){
                stack.push(current.left) ;
                value.push(temp+1);
            }

        }

    return level;
    }

        public int maxDepthRecursion(TreeNode root) {

        //Time complexity: O(log(n))
       // Space complexity: O(1)
        if(root==null){
            return 0;
        }
        if (root.left == null && root.right == null) return 1;

        return 1+Math.max(maxDepthRecursion(root.left),maxDepthRecursion(root.right));


    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode first =  new TreeNode(9);;
        TreeNode second = new TreeNode(20);
        TreeNode third = new TreeNode(15);
        TreeNode fourth = new TreeNode(7);

        root.left = first;
        root.right = second;
        second.left = third;
        second.right=fourth;

        MaximumDepthofBinaryTree104  binaryTreeDepth=new MaximumDepthofBinaryTree104();
       //int output =binaryTreeDepth.maxDepthBFS(root);
      // int output =binaryTreeDepth.maxDepthRecursion(root);
       int output =binaryTreeDepth.maxDepthDFS(root);


        System.out.println(output);

    }
}
