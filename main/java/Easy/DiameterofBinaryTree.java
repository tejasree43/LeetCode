package Easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DiameterofBinaryTree {

    int answer = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        calculateDiameter(root);
        return answer;
    }

    private int calculateDiameter(TreeNode root) {

        if(root == null){
            return 0;
        }

        int leftCount = calculateDiameter(root.left);
        int rightCount = calculateDiameter(root.right);

        int height = 1+Math.max(leftCount,rightCount);
        answer = Math.max(answer,leftCount+rightCount);
        return height;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;

        List<Integer> output =BinaryTreeInorderTraversal94.getTreeValues(root);
        System.out.println(output);
        DiameterofBinaryTree diameter = new DiameterofBinaryTree();
        int diameterOutput = diameter.diameterOfBinaryTree(root);
        System.out.println("diameterOutput"+diameterOutput);


    }
}

