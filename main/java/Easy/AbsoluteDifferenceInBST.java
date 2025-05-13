package Easy;

import java.util.ArrayList;
import java.util.List;

public class AbsoluteDifferenceInBST {

    List<Integer> inorderNodes = new ArrayList<>();

    void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        // Store the nodes in the list.
        inorderNodes.add(root.val);
        inorderTraversal(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        inorderTraversal(root);
        int minDistance = Integer.MAX_VALUE;
        System.out.println("minDistance"+minDistance);
        for (int i = 1; i < inorderNodes.size(); i++) {
            minDistance = Math.min(minDistance, inorderNodes.get(i) - inorderNodes.get(i-1));
        }

        return minDistance;
    }


        public static void main(String args[]) {
            AbsoluteDifferenceInBST ab=new AbsoluteDifferenceInBST();
            TreeNode tn = null;
            int[] treeInput={4,2,6,1,3};
            
            for(int i=0;i<treeInput.length;i++)
            {
                new TreeNode(treeInput[i]);
            }
            ab.minDiffInBST(tn);
    }

    }
