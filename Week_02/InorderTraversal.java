import java.util.ArrayList;
import java.util.List;

/**
 * @description:中序遍历，左根右
 * @author: yaobw
 * @date: 2020/8/9 4:11 下午
 */
public class InorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traversal(root, list);
        return list;
    }

    private void traversal(TreeNode tree, List<Integer> list) {
        if (tree != null) {
            if (tree.left != null) {
                traversal(tree.left, list);
            }
            list.add(tree.val);
            if (tree.right != null) {
                traversal(tree.right, list);
            }
        }
    }
}
