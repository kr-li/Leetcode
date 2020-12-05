import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 是否存在路径和
 */

public class Leetcode112 {
    //深度优先搜索

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == sum;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }


    /**
     * 回溯算法
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum2(TreeNode root, int sum){
        if (root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<List<Integer>> listStack = new Stack<>();


        List<Integer> integerList = new ArrayList<>();

        nodeStack.push(root);
        integerList.add(root.val);

        listStack.push(integerList);

        while (!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pop();
            List<Integer> tempList = listStack.pop();

            //int val = tempList.get(integerList.size() - 1);

            if (node.left == null && node.right == null){
                if (sum == node.val){
                    return true;
                }
            }

            if (node.right != null){
                tempList.add(node.val);
                listStack.push(new ArrayList<>(tempList));
                node.right.val += node.val;
                nodeStack.push(node.right);
                tempList.remove(tempList.size() - 1);
            }

            if (node.left != null){
                tempList.add(node.val);
                listStack.push(new ArrayList<>(tempList));
                node.left.val += node.val;
                nodeStack.push(node.left);
                tempList.remove(tempList.size() - 1);
            }
        }
        return false;
    }

}
