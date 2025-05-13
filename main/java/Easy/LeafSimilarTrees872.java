package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeafSimilarTrees872 {

    public boolean leafSimilar(TreeNode1 root1, TreeNode1 root2) {

        Stack<TreeNode1> stack = new Stack<>();
        Stack<TreeNode1> stack2 = new Stack<>();

        stack.push(root1);
        stack2.push(root2);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while(!stack.isEmpty()){

        TreeNode1 current = stack.pop();

        if(current.right==null&&current.left==null){
                list1.add(current.val);
        }
        if(current.right!=null){
            stack.push(current.right) ;

        }
        if(current.left!=null){
           stack.push(current.left) ;
        }
        }
        System.out.println(list1);

        while(!stack2.isEmpty()){

            TreeNode1 current = stack2.pop();

            if(current.right==null&&current.left==null){
                list2.add(current.val);
            }
             if(current.right!=null){
                stack2.push(current.right) ;
            }
             if(current.left!=null){
                stack2.push(current.left) ;
            }
        }

        System.out.println(list2);

        return list1.equals(list2);
    }

    /*private void leafSimilar(TreeNode root, TreeNode root1) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        helper(root,list1);
        helper(root1,list2);
        System.out.println(list1);
        System.out.println(list2);
        list1.equals(list2);
    }

    public void helper(TreeNode root,List list){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        helper(root.left,list);
        helper(root.right,list);
    }
*/

    public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(3);
        TreeNode1 first = new TreeNode1(5);
        TreeNode1 second = new TreeNode1(1);
        TreeNode1 three = new TreeNode1(6);
        TreeNode1 four = new TreeNode1(2);
        TreeNode1 five = new TreeNode1(9);
        TreeNode1 six = new TreeNode1(8);
        TreeNode1 seven = new TreeNode1(7);
        TreeNode1 eight = new TreeNode1(4);

        root.left = first;
        root.right = second;
        first.left = three;
        first.right =four;
        second.left = five;

        second.right = six;
        three.left = null;
        three.right = null;
        four.left = seven ;
        four.right = eight;

        //root 2

        TreeNode1 root1 = new TreeNode1(3);
        TreeNode1 first1 = new TreeNode1(5);
        TreeNode1 second2 = new TreeNode1(1);
        TreeNode1 three3 = new TreeNode1(6);
        TreeNode1 four4 = new TreeNode1(7);
        TreeNode1 five5 = new TreeNode1(4);
        TreeNode1 six6 = new TreeNode1(2);
        TreeNode1 seven7 = new TreeNode1(9);
        TreeNode1 eight8 = new TreeNode1(8);

        root1.left = first1;
        root1.right = second2;

        first1.left = three3;
        first1.right =four4;

        second2.left = five5;
        second2.right = six6;

        six6.left = seven7 ;
        six6.right = eight8;

        TreeNode1 tree = new TreeNode1();
        List<Integer> output=  tree.getTreeValues(root1);

       // output.stream().forEach(s->System.out.println(s));

        LeafSimilarTrees872 leaf = new LeafSimilarTrees872();
        boolean valueOutput =  leaf.leafSimilar(root,root1);

        System.out.println("valueOutput"+valueOutput);
      //  leaf.leafSimilarRecurisve(root,root1);


    }


}
