package Easy;


import java.util.List;

public class SearchBinarySearchTree700 {

    public TreeNode1 searchBST(TreeNode1 root, int val) {

        TreeNode1 ans = new TreeNode1();

        if(root == null||root.val == val ){
            return root;
        }
        if(root.val > val) {
            ans = searchBST(root.left, val);
        }
        else {
            ans = searchBST(root.right, val);
        }

        return ans;
    }

    private void helper(TreeNode1 root, int val) {

        if(root.val == val){
            return ;
        }
        if(root.right!=null){
            helper( root.right,  val);

        }
        if(root.left!=null){
            helper( root.left, val);

        }
    }


    public static void main(String[] args) {

        SearchBinarySearchTree700 bst= new SearchBinarySearchTree700();
        TreeNode1 root = new TreeNode1(4);
        TreeNode1 treeNode2 = new TreeNode1(2);
        TreeNode1 treeNode3 = new TreeNode1(7);
        TreeNode1 treeNode4 = new TreeNode1(1);
        TreeNode1 treeNode6 = new TreeNode1(3);

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.right = treeNode6;
        treeNode2.left = treeNode4;
        TreeNode1 treeNode = new TreeNode1();
        List<Integer> listOutput1 = treeNode.getTreeValues(root);
        listOutput1.stream().forEach(System.out::println);

        System.out.println("------------");
        int value= 2;
        TreeNode1 outputNode =  bst.searchBST(root,value);
        System.out.println(outputNode.val);
        System.out.println(outputNode.left.val);
        System.out.println(outputNode.left.val);



    }
}
