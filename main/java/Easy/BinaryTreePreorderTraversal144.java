package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal144 {
    private TreeNode root;

    public class TreeNode{

        private int data;
        private TreeNode left;
        private  TreeNode right;

        TreeNode(int data)
        {
           this.data=data;
        }
        TreeNode()
        {
            this.data=data;
        }
  }
  public void createBinaryTree()
  {
      TreeNode first=new TreeNode(1);
      TreeNode second=new TreeNode();
      TreeNode third=new TreeNode(2);
      TreeNode fourth=new TreeNode(3);
       root = first;
       first.left=second;
       first.right=third;
       third.left=fourth;

  }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();

        if(root==null)
        {
            return l1;
        }
        Stack<TreeNode> tnStack=new Stack<TreeNode>();

        tnStack.push(root);
        while(!tnStack.isEmpty())
        {
          TreeNode temp=tnStack.pop();

              l1.add(temp.data);

           if(temp.right!=null)
           {
               tnStack.push(temp.right);
           }
            if(temp.left!=null)
            {
                tnStack.push(temp.left);
            }
        }

System.out.println("values"+l1);
       return l1;
    }

 public static void main(String[] args)
 {
     BinaryTreePreorderTraversal144 btp=new  BinaryTreePreorderTraversal144();
     btp.createBinaryTree();
     btp.preorderTraversal(btp.root);



 }
}
