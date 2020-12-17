import java.util.ArrayList;
import java.util.List;

public class Leetcode106 {


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();
        for (int i = 0; i < postorder.length; i++) {
            postList.add(postorder[i]);
            inList.add(inorder[i]);
        }
        TreeNode node = help(postList, inList);
        return node;
    }

    private TreeNode help(List<Integer> postList, List<Integer> inList) {
        if (inList.size() == 0) return null;
        int rootVal = postList.remove(postList.size() - 1);
        TreeNode root = new TreeNode(rootVal);
        int mid = inList.indexOf(rootVal);
        root.right = help(postList, inList.subList(mid + 1, inList.size()));
        root.left = help(postList, inList.subList(0, mid));

        return root;
    }
}
