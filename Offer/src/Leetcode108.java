import java.util.ArrayList;
import java.util.List;

public class Leetcode108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode root =  help(nums, 0, nums.length - 1);

        return root;
    }

    private TreeNode help(int[] arr, int left, int right){
        if (left > right) return null;
        int mid = (left + right) / 2;
        int midNum = arr[mid];
        TreeNode node = new TreeNode(midNum);
        node.left = help(arr, left, mid - 1);
        node.right = help(arr, mid + 1, right);
        return node;
    }
}
