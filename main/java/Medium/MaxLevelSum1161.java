package Medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelSum1161 {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int MaxSum =Integer.MIN_VALUE;
        int level = 1;
        int answer = 1;

        while(!queue.isEmpty()){
            int sum = 0;

                int size = queue.size();
                for(int i=0;i<size;i++) {
                    TreeNode node = queue.poll();
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    sum += node.val;
                }

            if(MaxSum<sum){
                MaxSum = sum;
                answer = level;
            }
            level++;
        }
        System.out.println("max sum"+ answer);

        return answer;
    }
    public static void main(String[] args) {
       /* TreeNode root = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(30);
        TreeNode treeNode4 = new TreeNode(40);
        TreeNode treeNode6 = new TreeNode(60);

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.right = treeNode6;
        treeNode2.left = treeNode4;
        TreeNode treeNode = new TreeNode();
        List<Integer> listOutput1 = treeNode.getTreeValues(root);
        listOutput1.stream().forEach(System.out::println);*/
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(8);

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.right = treeNode6;
        treeNode2.left = treeNode4;
        TreeNode treeNode = new TreeNode();
        List<Integer> listOutput1 = treeNode.getTreeValues(root);
        listOutput1.stream().forEach(System.out::println);

        MaxLevelSum1161 maxLevel = new MaxLevelSum1161();
        maxLevel.maxLevelSum(root);
        System.out.println("---------");


    }


}
