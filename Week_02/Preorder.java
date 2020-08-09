import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/8/9 4:08 下午
 */
public class Preorder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        traversal(root, list);
        return list;
    }

    public void traversal(Node node, List<Integer> list){
        if(node == null){
            return;
        }
        if(node.children != null){
            list.add(node.val);
            for(int i = 0; i < node.children.size(); i++){
                traversal(node.children.get(i), list);
            }
        }
    }
}
