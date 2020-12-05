import java.util.*;

/**
 * 找到二叉树的所有路径
 * 可以用
 * 深度优先搜索:主要可以递归
 *
 *
 * 广度优先搜索：运用队列
 */

public class Leetcode257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> treenodeQueue = new ArrayDeque<>();
        Queue<String> stringQueue = new ArrayDeque<>();

        treenodeQueue.add(root);
        stringQueue.add(Integer.toString(root.val));

        while (!treenodeQueue.isEmpty()){
            TreeNode node = treenodeQueue.poll();
            String path =stringQueue.poll();

            if (node.left == null && node.right == null){
                ans.add(path);
            }
            if (node.left != null){
                treenodeQueue.add(node.left);
                stringQueue.add(new StringBuilder(path).append("->").append(node.left.val).toString());
            }
            if (node.right != null){
                treenodeQueue.add(node.right);
                stringQueue.add(new StringBuilder(path).append("->").append(node.right.val).toString());
            }
        }
        return ans;
    }

    /**
     * 运用回溯算法
     * @param root
     * @return
     */
    public List<String> binaryTreePaths2(TreeNode root){
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> treeNodeStack = new Stack<>();
        Stack<StringBuilder> listStack = new Stack<>();

        StringBuilder sb = new StringBuilder(Integer.toString(root.val));

        treeNodeStack.add(root);
        listStack.add(sb);

        while (!treeNodeStack.isEmpty()){
            TreeNode node = treeNodeStack.pop();
            StringBuilder tempSb = listStack.pop();

            if (node.left == null && node.right == null){
                ans.add(sb.toString());
            }

            if (node.right != null){
                tempSb.append("->").append(node.right.val);
                listStack.add(new StringBuilder(tempSb));
                treeNodeStack.push(node.right);
                tempSb.deleteCharAt(tempSb.length() - 1);
                tempSb.deleteCharAt(tempSb.length() - 1);
                tempSb.deleteCharAt(tempSb.length() - 1);
            }

            if (node.left != null){
                tempSb.append("->").append(Integer.toString(node.left.val));
                listStack.push(new StringBuilder(tempSb));
                treeNodeStack.push(node.left);
                tempSb.deleteCharAt(tempSb.length() - 1);
                tempSb.deleteCharAt(tempSb.length() - 1);
                tempSb.deleteCharAt(tempSb.length() - 1);
            }
        }
        return ans;
    }


    /**
     * 深度优先搜索 递归
     * @param root
     * @return
     */
    public List<String> binaryTreePaths3(TreeNode root){
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;
        help(root, "", ans);
        return ans;
    }

    private void help(TreeNode root, String s, List<String> ans) {
        if (root != null){
            StringBuilder pathsb = new StringBuilder(s);
            pathsb.append(Integer.toString(root.val));
            if (root.left == null && root.right == null){
                ans.add(pathsb.toString());
            }
            else {
                pathsb.append("->");
                help(root.left, pathsb.toString(), ans);
                help(root.right, pathsb.toString(), ans);
            }
        }
    }
}
