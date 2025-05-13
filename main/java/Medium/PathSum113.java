package Medium;

import Easy.TreeNode1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class PathSum113 {

    List<List<Integer>> output=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode1 root, int targetSum) {

        backtracking(root,new LinkedList<>(),targetSum);
        System.out.println(output);
        return output;
        }

    private void backtracking(TreeNode1 root, List<Integer> list,int targetSum) {

        if(root==null){
            return;
        }

        list.add(root.val);

        if(root.left==null&&root.right==null&&targetSum-root.val==0){
            output.add(new ArrayList<>(list));
        }
            backtracking(root.right,list,targetSum-root.val);
            backtracking(root.left,list,targetSum-root.val);
            list.remove(new Integer(root.val));

        }





    void helper(ArrayList<Integer> al, TreeNode1 root) {

        if(root==null){
            return;
        }
        al.add(root.val);
        helper(al,root.left);
        helper(al,root.right);

    }

    public static void main(String[] args)
    {
        //binary tree setup
        TreeNode1 treeNode1=new TreeNode1(5);
        TreeNode1 treeNode2=new TreeNode1(4);
        TreeNode1 treeNode3=new TreeNode1(11);
        TreeNode1 treeNode4=new TreeNode1(7);
        TreeNode1 treeNode5=new TreeNode1(2);
        TreeNode1 treeNode6=new TreeNode1(8);
        TreeNode1 treeNode7=new TreeNode1(13);
        TreeNode1 treeNode8=new TreeNode1(4);
        TreeNode1 treeNode9=new TreeNode1(1);
         TreeNode1 treeNode10=new TreeNode1(5);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode6;
        treeNode2.left=treeNode3;
        // treeNode2.right=nullref;
        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;
        treeNode6.left=treeNode7;
        //treeNode7.left=nullref;
        //  treeNode7.right=nullref;
        treeNode6.right=treeNode8;
        treeNode8.right=treeNode9;
        treeNode8.left=treeNode10;


        /*TreeNode1 treeNode=new TreeNode1();

        List<Integer> l1= treeNode.getTreeValues(treeNode1);
        l1.stream().forEach(s->System.out.println(s));
*/
        PathSum113 ps=new PathSum113();

        int target=22;
        ps.pathSum(treeNode1,target);

      //  System.out.println("output="+output);


    }
}
