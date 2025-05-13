package Medium;

import Easy.TreeNode1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathSum437 {


    List<List<Integer>> output=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode1 root, int targetSum) {

        backtracking(root,new LinkedList<>(),targetSum);

        System.out.println(output);
        return output;
    }
    private void backtracking(TreeNode1 root, Queue<Integer> list, int targetSum) {

        if(root==null){
            return;
        }

        list.add(root.val);

        if(root.left==null&&root.right==null&&targetSum-root.val==0){
            output.add(new ArrayList<>(list));
        }
        if(root.right != null) {
            backtracking(root.right,list,targetSum-root.val);
            list.poll();

        }
        if(root.left != null) {
            backtracking(root.right,list,targetSum-root.val);
            list.poll();

        }

       // backtracking(root.left,list,targetSum-root.val);
    }

    public static void main(String[] args)
    {
        //binary tree setup
        TreeNode1 treeNode1=new TreeNode1(10);
        TreeNode1 treeNode2=new TreeNode1(5);
        TreeNode1 treeNode3=new TreeNode1(3);
        TreeNode1 treeNode4=new TreeNode1(2);
        TreeNode1 treeNode5=new TreeNode1(3);
        TreeNode1 treeNode6=new TreeNode1(-2);
        TreeNode1 treeNode8=new TreeNode1(1);
        TreeNode1 treeNode9=new TreeNode1(-3);
        TreeNode1 treeNode10=new TreeNode1(11);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode9;

        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;

        treeNode4.right=treeNode8;

        treeNode3.left=treeNode5;
        treeNode3.right=treeNode6;


        treeNode9.right=treeNode10;

       TreeNode1 treeNode=new TreeNode1();

       List<Integer> l1= treeNode.getTreeValues(treeNode1);
        l1.stream().forEach(s->System.out.println(s));



        PathSum437 ps=new PathSum437();

        int target=8;
          ps.pathSum(treeNode1,target);

    }
}
