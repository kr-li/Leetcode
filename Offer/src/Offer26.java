import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer26 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++){
            preorderList.add(preorder[i]);
            inorderList.add(inorder[i]);
        }
        return helper(preorderList, inorderList);
    }

    TreeNode helper(List<Integer> preorder, List<Integer> inorder){
        if (inorder.size() == 0) return null;
        int rootVal = preorder.remove(0);
        TreeNode root = new TreeNode(rootVal);
        int mid = inorder.indexOf(rootVal);
        root.left = helper(preorder, inorder.subList(0, mid));
        root.right = helper(preorder, inorder.subList(mid + 1, inorder.size()));

        return root;
    }
}
