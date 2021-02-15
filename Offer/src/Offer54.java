import java.util.ArrayList;

/**
 * 递归实现存放数组中
 */

public class Offer54 {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        help(root, arrayList);
        return arrayList.get(arrayList.size() - k);
    }

    private void help(TreeNode root, ArrayList<Integer> arrayList){
        if (root == null) return;
        if (root.left != null) help(root.left, arrayList);
        arrayList.add(root.val);
        if (root.right != null) help(root.right, arrayList);
    }
}
