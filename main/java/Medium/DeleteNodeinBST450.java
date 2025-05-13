package Medium;

import Easy.SearchBinarySearchTree700;
import Easy.TreeNode1;

import java.util.List;

public class DeleteNodeinBST450 {

    public TreeNode1 deleteNode(TreeNode1 root, int key) {
        if(root == null){
            return null;
        }
        if(root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        else if(root.val < key) {
            root.right =deleteNode(root.right, key);
            return root;
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
             TreeNode1 min = root.right;

             while(min.left!=null){
                 min = min.left;
             }
                root.val =min.val;
                root.right = deleteNode(root.right, min.val);
                return root;

            }

        }

    }
    public static void main(String[] args) {

        DeleteNodeinBST450 deleteBst = new DeleteNodeinBST450();
        TreeNode1 root = new TreeNode1(5);
        TreeNode1 treeNode2 = new TreeNode1(3);
        TreeNode1 treeNode3 = new TreeNode1(6);
        TreeNode1 treeNode4 = new TreeNode1(2);
        TreeNode1 treeNode6 = new TreeNode1(4);
        TreeNode1 treeNode7 = new TreeNode1(7);

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.right = treeNode6;
        treeNode2.left = treeNode4;
        treeNode3.right = treeNode7;
        TreeNode1 treeNode = new TreeNode1();
        List<Integer> listOutput1 = treeNode.getTreeValues(root);
        listOutput1.stream().forEach(System.out::println);

        System.out.println("------------");
        int key = 3;
        TreeNode1 outputNode = deleteBst.deleteNode(root, key);
        /*System.out.println(outputNode.val);
        System.out.println(outputNode.left.val);
        System.out.println(outputNode.right.val);*/
        List<Integer> listOutput2 = treeNode.getTreeValues(root);
        listOutput2.stream().forEach(System.out::println);
    }
}
