package Easy;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94 {


    public static List<Integer> getTreeValues(TreeNode root)
    {
        List<Integer> al=new ArrayList<>();
        helper((ArrayList) al,root);
        return al;
    }

    private static void helper(ArrayList al, TreeNode root) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        helper(al,root.left);
        helper(al,root.right);
    }

    public  List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> result=new ArrayList<>();

    if(root==null)
    {
        return result;
    }

    Stack<TreeNode> stack=new Stack<>();
    TreeNode temp=root;

    while(!stack.isEmpty()||temp!=null){

        //stack.push(temp);

        if(temp!=null){
            stack.push(temp);
            temp=temp.left;
        }
        else{
          TreeNode newTemp= stack.pop();
          result.add(newTemp.val);
          temp=newTemp.right;
        }

    }


        return result;
    }

        public static void main(String[] args) {

            TreeNode root = new TreeNode(1);
             TreeNode first =  new TreeNode(4);;
            TreeNode second = new TreeNode(2);
            TreeNode third = new TreeNode(3);

            root.left = first;
            root.right = second;
            second.left = third;

    BinaryTreeInorderTraversal94  binaryTreeInorder=new BinaryTreeInorderTraversal94();
    //List<Integer> output =binaryTreeInorder.getTreeValues(root);
    List<Integer> output =binaryTreeInorder.inorderTraversal(root);

    System.out.println(output);

    }
}
