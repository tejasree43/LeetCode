package Medium;

import Easy.TreeNode1;

import java.util.LinkedList;
import java.util.*;
import java.util.Stack;

public class PathSumIII437 {

    int counter = 0;

    public int pathSum(TreeNode1 root, int targetSum) {

        if(root==null){
            return 0;
        }

        Stack<TreeNode1> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode1 current = stack.pop();
            dfs(current, (long) targetSum);

            if (current.right != null) {
                stack.push(current.right);

            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        dfs(root, (long) targetSum);
        dfs(root.left, (long) targetSum);
        dfs(root.right, (long) targetSum);


        return counter;

        }
        private void dfs (TreeNode1 root,long target){
            if (root == null) {
                return;
            }
            if (target-root.val ==0) {
                counter++;
            }
            dfs(root.left, target - root.val);
            dfs(root.right, target - root.val);

        }

    public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(10);
        TreeNode1 second = new TreeNode1(5);
        TreeNode1 three = new TreeNode1(-3);
        TreeNode1 four = new TreeNode1(3);
        TreeNode1 five = new TreeNode1(2);
        TreeNode1 six = new TreeNode1(11);
        TreeNode1 sev = new TreeNode1(1);
        TreeNode1 eight = new TreeNode1(3);
        TreeNode1 nine = new TreeNode1(-2);

        root.right = three ;
        root.left = second;
        second.right = five;
        second.left = four;
        five.right = sev;
        three.right = six;
        four.left = eight;
        four.right = nine;

        TreeNode1 tree = new TreeNode1();
        List<Integer> output = tree.getTreeValues(root);

        output.stream().forEach(s -> System.out.println(s));
        PathSumIII437 path = new PathSumIII437();
        int target =8;
       int valueOutput = path.pathSum(root,target);
       System.out.println("valueOutput"+valueOutput);
    }
}