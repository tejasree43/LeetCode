package Interview;


public class LevelBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public static void main(String[] args) {
            // case
           /* TreeNode node6 = new TreeNode(6, new TreeNode(1), new TreeNode(2));
            TreeNode node15 = new TreeNode(15, null, new TreeNode(4));
            TreeNode node7 = new TreeNode(7, new TreeNode(8), null);
            TreeNode node9 = new TreeNode(9, null, node6);
            TreeNode node20 = new TreeNode(20, node15, node7);
            TreeNode node3 = new TreeNode(3, node9, node20);
            List<List<Integer>> result = levelOrder(node6);
            System.out.println(result);
        }

        // implement this method
        public static List<List<Integer>> levelOrder(TreeNode root){
            List<List<Integer>> resultList = new ArrayList<>();



        }*/
    }
}
/*

        *
        * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
        *
        *
        *.        3
        *.      /   \
        *.     9      20
        *.      \   /   \
        *.       6 15    7
        *       / \  \  /
        *      1   2  4 8
        *
        * Output: [[3],[9,20],[6,15,7],[1,2,4,8]]
        *
        **/
