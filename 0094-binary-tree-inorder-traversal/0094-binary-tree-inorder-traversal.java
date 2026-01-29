import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    void inorder(TreeNode root, List<Integer> list) {
        if (root == null)
        { 
        return;
        }

        inorder(root.left, list);   // left
        list.add(root.val);         // root
        inorder(root.right, list);  // right
    }
}
