import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Mianshi34 {
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);

        List<Integer> list = new ArrayList<>();
        list.add(root.val);

        Stack<List<Integer>> listStack = new Stack<>();
        listStack.push(list);

        while(!treeNodeStack.isEmpty()){
            TreeNode node = treeNodeStack.pop();
            List<Integer> temp = listStack.pop();

            if (node.left == null && node.right == null && node.val == sum){
                ans.add(temp);
            }

            if (node.right != null){
                temp.add(node.right.val);
                listStack.push(new ArrayList<>(temp));
                node.right.val += node.val;
                treeNodeStack.push(node.right);
                temp.remove(temp.size() - 1);
            }

            if (node.left != null){
                temp.add(node.left.val);
                listStack.push(new ArrayList<>(temp));
                node.left.val += node.val;
                treeNodeStack.push(node.left);
                temp.remove(temp.size() - 1);
            }
        }
        return ans;
    }


}
