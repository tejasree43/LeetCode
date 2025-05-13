package Medium;

import Easy.TreeNode1;

import java.util.List;

public class LowestCommonAncestor236 {
    public TreeNode1 lowestCommonAncestor(TreeNode1 root, TreeNode1 p, TreeNode1 q) {

        if(root==null){
            return null;
        }
        if(root == p||root ==q){
            return root;
        }
        TreeNode1 left = lowestCommonAncestor(root.left,p,q);
        TreeNode1 right = lowestCommonAncestor(root.right,p,q);

        if(left!=null&&right!=null){
            return root;
        }

        return left==null?right:left;
    }

    public static void main(String[] args) {

        TreeNode1 root = new TreeNode1(3);
        TreeNode1 second = new TreeNode1(5);
        TreeNode1 three = new TreeNode1(1);
        TreeNode1 four = new TreeNode1(6);
        TreeNode1 five = new TreeNode1(2);
        TreeNode1 six = new TreeNode1(0);
        TreeNode1 sev = new TreeNode1(8);
        TreeNode1 eight = new TreeNode1(7);
        TreeNode1 nine = new TreeNode1(4);

        root.right = three;
        root.left = second;

        second.right = five;
        second.left = four;

        five.left = eight;
        five.right = nine;

        three.right = sev;
        three.left = six;


        TreeNode1 tree = new TreeNode1();
        List<Integer> output = tree.getTreeValues(root);
        output.stream().forEach(s -> System.out.println(s));

        LowestCommonAncestor236 lca = new LowestCommonAncestor236();

        TreeNode1 node = lca.lowestCommonAncestor(root,second,nine);

        System.out.println("node"+node.val);

    }
}
