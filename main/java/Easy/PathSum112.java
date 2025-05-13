package Easy;



import java.util.*;


public class PathSum112 {
    public boolean hasPathSum(TreeNode1 root, int targetSum) {

        if(root==null){
            return false;
        }

        Queue<TreeNode1> queue=new LinkedList<>();
        queue.add(root);

        ArrayList list=new ArrayList<>();
        while(!queue.isEmpty()){

            int i=queue.size();

            while(i>0){
                TreeNode1 current=queue.poll();
                if(current.left!=null){
                    current.left.val=current.val+current.left.val;
                   // current=current.left;
                    queue.add(current.left);
                }
                if(current.right!=null){
                    current.right.val=current.val+current.right.val;
                    //current=current.right;
                    queue.add(current.right);

                }
                if(current.left==null&&current.right==null){
                    list.add(current.val);
                }
                i--;
            }
        }

    System.out.println("list="+list);

        return list.contains(targetSum);
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
       // TreeNode1 nullref=new TreeNode1(0);

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


        TreeNode1 treeNode=new TreeNode1();

        List<Integer> l1= treeNode.getTreeValues(treeNode1);
         l1.stream().forEach(s->System.out.println(s));

        PathSum112 ps=new PathSum112();

        int target=22;
        boolean output=ps.hasPathSum(treeNode1,target);

        System.out.println("output="+output);


    }
}
