public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return help(postorder, 0,postorder.length - 1);
    }

    private boolean help(int[] postorder, int i, int j) {
       if (i >= j) return true;

       int p = i;
       int root = postorder[j];
       while (postorder[p] < root){
           p++;
       }

       int m = p;
       while (postorder[p] > root){
           p++;
       }

       return p == j && help(postorder, i, m-1) && help(postorder, m, j - 1);
    }
}
