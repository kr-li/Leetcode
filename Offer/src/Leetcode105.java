import java.util.ArrayList;
import java.util.List;

public class Leetcode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preList.add(preorder[i]);
            inList.add(inorder[i]);
        }
        TreeNode node = help(preList, inList);
        return node;
    }

    private TreeNode help(List<Integer> preList, List<Integer> inList) {
        if (inList.size() == 0) return null;
        int rootVal = preList.remove(0);
        TreeNode root = new TreeNode(rootVal);
        int mid = inList.indexOf(rootVal);
        root.left = help(preList, inList.subList(0, mid));
        root.right = help(preList, inList.subList(mid + 1, inList.size()));
        return root;
    }
}
