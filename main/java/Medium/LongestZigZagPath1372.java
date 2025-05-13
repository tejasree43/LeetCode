package Medium;

import Easy.TreeNode1;
import java.util.List;

public class LongestZigZagPath1372 {
    long currentMax = 0;
    public int longestZigZag(TreeNode1 root) {

        if(root == null) {
            return 0;
        }

        dfs(root, 0 ,"R");
        dfs(root, 0 ,"L");

        return (int) currentMax;
    }

    private void dfs (TreeNode1 root,long currentValue,String direction) {
        if (root == null) {
            return;
        }

        currentMax = Math.max(currentValue,currentMax);

        if(direction=="R") {

            dfs (root.left, currentValue + 1,"L");
            dfs (root.right, 1,"R");

        }
        else {

            dfs (root.right, currentValue + 1,"R");
            dfs (root.left, 1,"L");

        }
    }

    public static void main(String[] args)   {

    TreeNode1 root   =   new TreeNode1(10);
    TreeNode1 second =   new TreeNode1(5);
    TreeNode1 three  =   new TreeNode1(-3);
    TreeNode1 four   =   new TreeNode1(3);
    TreeNode1 five   =   new TreeNode1(2);
    TreeNode1 six    =   new TreeNode1(11);
    TreeNode1 sev    =   new TreeNode1(1);
    TreeNode1 eight  =   new TreeNode1(3);
    TreeNode1 nine   =   new TreeNode1(-2);

    root.right   = three ;
    root.left    = second;
    second.right = five;
    second.left  = four;
    five.left    = sev;
    three.right  = six;
    four.left    = eight;
    four.right   = nine;

    TreeNode1 tree = new TreeNode1();
    List<Integer> output = tree.getTreeValues(root);

    output.stream().forEach(s -> System.out.println(s));

    LongestZigZagPath1372 zigzag = new LongestZigZagPath1372();
    int zigzags = zigzag.longestZigZag(root);
    System.out.println("zigzags"+zigzags);

 }

}
