package Medium;

import Easy.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {

        return  isValidTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isValidTree(TreeNode root, int min, int max) {

        if(root==null){
            return true;
        }

        if(root.val<=min||root.val>=max)
        {
            return false;
        }

        return isValidTree(root.left,min,root.val)&&isValidTree(root.left,root.val,max);
    }


    public static void main (String[]args){

            TreeNode root = new TreeNode(5);
            TreeNode first = new TreeNode(1);
            TreeNode second = new TreeNode(7);
            TreeNode third = new TreeNode(8);
            TreeNode fourth = new TreeNode(9);

            root.left = first;
            root.right = second;
            second.left = third;
            second.right = fourth;


            ValidateBinarySearchTree98 binaryTree = new ValidateBinarySearchTree98();
            //List<Integer> output =binaryTreeInorder.getTreeValues(root);
            boolean output = binaryTree.isValidBST(root);

            System.out.println(output);

        }
    }
