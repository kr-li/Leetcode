import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 路径和为sum的所有路径
 *
 * 维护一个结点栈和一个数组栈
 *
 * 维护一个存值的数组
 *
 * 分别添加结点值到数组中，再将数组放入数组栈，再将数组回溯到前一个结点，这样可保证数组栈中都是不同路径
 */
public class Leetcode113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        //如果节点为空直接返回
        if (root == null)
            return res;
        Stack<TreeNode> stackNode = new Stack<>();
        Stack<List<Integer>> stackList = new Stack<>();
        stackNode.add(root);

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        stackList.add(list);
        while (!stackNode.empty()) {
            TreeNode node = stackNode.pop();
            List<Integer> tempList = stackList.pop();
            if (node.left == null && node.right == null && node.val == sum) {
                //如果满足条件，就把路径存储到res中
                res.add(tempList);
            }

            if (node.right != null) {
                tempList.add(node.right.val);
                stackList.add(new ArrayList<>(tempList));
                node.right.val += node.val;
                stackNode.push(node.right);
                tempList.remove(tempList.size() - 1);

            }
            if (node.left != null) {
                tempList.add(node.left.val);
                stackList.add(new ArrayList<>(tempList));
                node.left.val += node.val;
                stackNode.push(node.left);
                tempList.remove(tempList.size() - 1);
            }
        }
        return res;
    }
}
