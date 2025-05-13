package DataStructures;

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
      TreeNode second=new TreeNode(2);
      TreeNode third=new TreeNode(3);
      TreeNode fourth=new TreeNode(4);
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

//System.out.println("values"+l1);
       return l1;
    }

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();

        if(root==null)
        {
            return l1;
        }
        Stack<TreeNode> tnStack=new Stack<TreeNode>();

        TreeNode temp=root;

        while(!tnStack.isEmpty()||temp!=null)
        {
          if(temp.right!=null)
          {
              tnStack.push(temp);
              temp=temp.left;
          }
          else{
             TreeNode newTemp= tnStack.pop();
              l1.add(newTemp.data);
              temp=newTemp.right;
          }

        }
        System.out.println("l1"+l1);
        return l1;
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();

        if(root==null)
        {
            return l1;
        }
        Stack<TreeNode> tnStack=new Stack<TreeNode>();

        TreeNode temp=root;

        while(!tnStack.isEmpty()||temp!=null)
        {
            if(temp!=null)
            {
                tnStack.push(temp);
                temp=temp.right;
            }
            else{
                TreeNode newTemp= tnStack.pop();
                System.out.println("newTemp="+newTemp.data);
                l1.add(newTemp.data);
                temp=newTemp.left;
            }

        }
        System.out.println("l1"+l1);
        return l1;
    }


    public List<Integer> getTreeValues(TreeNode root) {

        List<Integer> al = new ArrayList<>();
        helper(root,al);
        return al;
   }

         public void helper(TreeNode root,List<Integer> al) {
            if (root == null) {
                return;
            }
             al.add(root.data);
             helper(root.left,al);
             helper(root.right,al);

        }



 public static void main(String[] args)
 {
     BinaryTreePreorderTraversal144 btp=new  BinaryTreePreorderTraversal144();
     btp.createBinaryTree();
    // btp.preorderTraversal(btp.root);
     List<Integer> l1= btp.getTreeValues(btp.root);

     l1.stream().forEach(s->System.out.println(s));
     //btp.inOrderTraversal(btp.root);
     btp.postOrderTraversal(btp.root);


 }
}
