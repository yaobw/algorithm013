import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/8/9 4:12 下午
 */
public class PreorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traversal(root, list);
        return list;
    }

    public void traversal(TreeNode tree, List<Integer> list) {
        if (tree == null) {
            return;
        }
        list.add(tree.val);
        if (tree.left != null) {
            traversal(tree.left, list);
        }
        if (tree.right != null) {
            traversal(tree.right, list);
        }
    }
}
