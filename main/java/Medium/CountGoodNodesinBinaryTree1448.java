package Medium;

import Easy.TreeNode1;

import java.util.List;
import java.util.Stack;


public class CountGoodNodesinBinaryTree1448 {

    public int goodNodes(TreeNode1 root) {

    if(root==null){
            return 0;
    }

     Stack<TreeNode1> stack = new Stack<>();
     stack.push(root);

     Stack<Integer> maxValueStack = new Stack<>();
     maxValueStack.push(root.val);

     int counter = 0;

     while(!stack.isEmpty()){
         TreeNode1 current = stack.pop();
         int maxValue = maxValueStack.pop();

         if(current.val>=maxValue){
             counter++;
             maxValue = current.val;
         }

         if(current.right!= null){
             stack.push(current.right);
             maxValueStack.push(maxValue);
         }
       if(current.left!=null){
           stack.push(current.left);
           maxValueStack.push(maxValue);
       }

     }
     return counter;
    }
    int counter =0;
    public int goodNodesRecursive(TreeNode1 root) {
        if(root==null){
            return 0;
        }
        int max = root.val;
        helperMethod(root,max);
        return counter;
    }

    private void helperMethod(TreeNode1 root,int maxValue) {

        if(root==null){
            return ;
        }
        if(root.val>=maxValue){
            counter++;
            maxValue = root.val;
        }
        helperMethod(root.right,maxValue);
        helperMethod(root.left,maxValue);
    }

    public static void main(String[] args) {

      /*  TreeNode1 root = new TreeNode1(3);
        TreeNode1 first = new TreeNode1(1);
        TreeNode1 second = new TreeNode1(4);
        TreeNode1 three = new TreeNode1(3);
        TreeNode1 five = new TreeNode1(5);
        TreeNode1 six = new TreeNode1(1);

        root.left = first;
        root.right = second;

        first.left = three;

        second.right = five;
        second.left = six;

*/

        TreeNode1 root = new TreeNode1(2);
        TreeNode1 second = new TreeNode1(4);
        TreeNode1 three = new TreeNode1(8);
        TreeNode1 five = new TreeNode1(10);
        TreeNode1 six = new TreeNode1(4);

        root.right = second;

        second.right = three;
        second.left = five;

        three.left = six;

        TreeNode1 tree = new TreeNode1();
        List<Integer> output=  tree.getTreeValues(root);

        //output.stream().forEach(s->System.out.println(s));
        CountGoodNodesinBinaryTree1448 countGood = new CountGoodNodesinBinaryTree1448();

        //int counter = countGood.goodNodes(root);
        int counter = countGood.goodNodesRecursive(root);
        System.out.println(counter);

    }
}
