package Easy;

import java.util.ArrayList;
import java.util.List;

public class TreeNode1 {
        public int val;
        public TreeNode1 left;
        public TreeNode1 right;
        public TreeNode1() {}
        public TreeNode1(int val) { this.val = val; }
        TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    public List<Integer> getTreeValues(TreeNode1 root)
    {
        List<Integer> al=new ArrayList<>();
        helper((ArrayList) al,root);
        return al;
    }
    private void helper(ArrayList al, TreeNode1 root) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        helper(al,root.left);
        helper(al,root.right);

    }

}
